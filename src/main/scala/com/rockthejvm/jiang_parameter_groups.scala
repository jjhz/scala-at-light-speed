package com.rockthejvm

object jiang_parameter_groups extends App {

  def myMethod(name: String): Unit = 23

  println(myMethod("Jiang"))

  def myMethod2(name: String)(name2: String)(testFun: Any)(testFun2: Any): Unit = 23
  myMethod2("jiang")("jiang2"){
    99
  }
//从spark sql test来的
//  def test(testName: String, testTags: Tag*)(testFun: => Any)
//          (implicit pos: Position): Unit = {
//    if (testTags.exists(_.isInstanceOf[DisableAdaptiveExecution])) {
//      super.test(testName, testTags: _*) {
//        withSQLConf(SQLConf.ADAPTIVE_EXECUTION_ENABLED.key -> "false") {
//          testFun
//        }
//      }
//    } else {
//      super.test(testName, testTags: _*)(testFun)
//    }
//  }


//  test("forPath") { //注意这里可以直接传方法体，非常可读
//    withTempDir { dir =>
//      testData.write.format("delta").save(dir.getAbsolutePath)
//      checkAnswer(
//        DeltaTable.forPath(spark, dir.getAbsolutePath).toDF,
//        testData.collect().toSeq)
//      checkAnswer(
//        DeltaTable.forPath(dir.getAbsolutePath).toDF,
//        testData.collect().toSeq)
//    }
//  }
}
