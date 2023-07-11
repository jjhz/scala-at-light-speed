package com.rockthejvm

import scala.util.Try

object jiang_try_option extends App {

  def myEx(): String = throw new RuntimeException //注意，这里是返回string，但是写死抛出异常！！
  def myOk(): String = "haha" //这里是真正的string



  val myString = Try(myEx()) //这里是Failure类
  val myOkString = Try(myOk()) //这里是Success类，依旧不是string


  println(myString)
  println(myOkString)
}
