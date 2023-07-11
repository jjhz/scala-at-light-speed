package com.rockthejvm

object jiang_implicit extends App{

  def test1(implicit a: Int): Int = a + 1
  implicit val x: Int = 5
  //implicit val y: Int = 6  //报错

  print(test1) //打印6，虽然没放参数，但是可以自动识别出来是x。 如果再加一个会报错，比如y

  def test2(implicit a: Int): Int = a + 2



}
