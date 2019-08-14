package com.atguigu.chapter09

object ImplicitValue {
  def main(args: Array[String]): Unit = {
    //str1就是一个隐式值
    implicit val str1: String = "jack"

    hello // jack hello => 底层是hello(str1)
  }

  //name就是隐式参数
  def hello(implicit name: String): Unit = {
    println(name + " hello")
  }
}




