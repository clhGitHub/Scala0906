package com.atguigu.chapter11

object MapExercise01 {
  def main(args: Array[String]): Unit = {

    val names = List("Alice", "Bob", "Nick")
    def upper(s:String): String = {
      println("被调用~~~")
      s.toUpperCase
    }
    val names2 = names.map(upper)
    println("names=" + names2) //得到大写的字符串

  }
}
