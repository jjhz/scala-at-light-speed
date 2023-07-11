package com.rockthejvm

object jiang_implicit extends App{

  def test1(implicit a: Int): Int = a + 1
  implicit val x: Int = 5
  //implicit val y: Int = 6  //报错

  println(test1) //打印6，虽然没放参数，但是可以自动识别出来是x。 如果再加一个会报错，比如y

  def test2(implicit a: Int): Int = a + 2



  //另外一种，非常的有趣，和rdd的差不多，仔细看看下面的

  /**
   * 我有一个int，我需要判断这个int是不是偶数
   * 通常来说，我会写一个function，然后把这个int传进去
   * isEven(myInt)
   * 但是如果这个int本身就带有这个方法，是不是更酷！！？？
   * myInt.isEven()
   */

  implicit class MyRichInteger(n: Int) {
    def isEven() = n % 2 == 0
  }

  println(23.isEven())
  //因为构造函数take 1个int且内部有isEven方法的只有MyRichInteger类



  implicit class jiang_MyRichInteger(n: Int) {
    def isNotEven() = n % 2 != 0
  }

  println(23.isNotEven())
  //构造函数take 1个int且内部有isNotEven方法的只有jiang_MyRichInteger类
  //所以，推断的线索可以是多个的，只要全部满足即可
}
