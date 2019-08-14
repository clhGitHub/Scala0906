package com.atguigu.chapter02

object StringToBasic {
  def main(args: Array[String]): Unit = {


//    val str = "hello"
//    //在开发中，我们可以使用异常来处理业务逻辑
//    println(str.toInt)
//    println(str.toDouble)
//    println(str.toFloat)
//    println(str.toByte)
    //大数据处理-》数据和类型（计算）

    var str2 = "12.5"
    //会抛出异常
    println(str2.toInt)
    //是ok
    println(str2.toDouble)
  }
}
