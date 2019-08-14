package com.atguigu.chapter07.myextends

object TypeConvertDemo {
  def main(args: Array[String]): Unit = {

    val worker = new Worker
    worker.sayOk()

    val p: Person3 = new Worker
    //调用
    p.sayHi()
    //能否将父类 转成 子类 (向下转型)
    //如果这样做，需要父类的引用，原来是指向该子类的地址
    p.asInstanceOf[Worker].sayOk()


    //ClassOf , 可以获取类的全路径
    println(classOf[String]) // String.class


  }
}

class Person3 {
  var name = "smith"
  val age = 80
  def sayHi(): Unit = {
    println(this.name + " hi")
  }

}
class  Worker extends  Person3 {
  def sayOk(): Unit = {
    println(this.name + " ok")
  }
}
