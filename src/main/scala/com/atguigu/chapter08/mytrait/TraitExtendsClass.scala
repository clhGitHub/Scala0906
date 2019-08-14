package com.atguigu.chapter08.mytrait

object TraitExtendsClass {
  def main(args: Array[String]): Unit = {
    println("hello~~")
  }
}

trait LoggedException extends Exception{
  def log(): Unit ={
    println(getMessage()) // 方法来自于Exception类
  }
}

//UnhappyException 就是Exception的子类.
class UnhappyException extends LoggedException{
  // 已经是Exception的子类了，所以可以重写方法
  override def getMessage: String = super.getMessage
}


//如果混入该特质的类，已经继承了另一个类(A类)，则要求A类是特质超类的子类，否则就会出现了多继承现象，发生错误。

// IndexOutOfBoundsException 父类时 Exception
// LoggedException 他的父类也是 Exeption
class UnhappyException3 extends IndexOutOfBoundsException with LoggedException //ok

class CCC extends Exception
class UnhappyException4 extends CCC with LoggedException // 不对