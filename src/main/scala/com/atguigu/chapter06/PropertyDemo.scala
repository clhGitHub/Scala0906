package com.atguigu.chapter06

object PropertyDemo {
  def main(args: Array[String]): Unit = {

    val p1 = new Person

    println(p1.age + p1.sal + p1.Name + " " + p1.address)

    /*println(p1.address == null) // true [String]
    println(p1.Name == null) // true [Null]
    println(p1.lover == null) // true [Person]*/

  }
}

class Person {
  var age: Int = 10
  var sal = 8090.9
  var Name = null //Name的类型  Null
  var address: String = null // address 是 String
  var lover: Person = _ //  当我们给一个对象一个 _ 默认值，也是 null

}

