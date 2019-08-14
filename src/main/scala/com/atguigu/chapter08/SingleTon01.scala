package com.atguigu.chapter08



object TestSingleTon extends App {
  val singleTon = SingleTon.getInstance
  val singleTon2 = SingleTon.getInstance
  println(singleTon2 == singleTon) // true
}

//将SingleTon的构造方法私有化
class SingleTon private() {}

//懒汉式...
object SingleTon {
  private var s: SingleTon = null

  def getInstance = {
    if (s == null) {
      s = new SingleTon
    }
    s
  }
}
