package com.lktbz.scala.day07

/**
 * 主类带有构造函数
 */
object AbstractExtendsDemo2  extends App {
  var animal = new Animal("aa",12)
  println(animal.name)
  println(animal.age)
  println("==========")
  var dog = new Dog("dd",22,"running")
  println(dog.name)
  println(dog.age)
  println(dog.hobby)
  println("==========")
  println(animal)
  println(dog)
}
class Animal(var name : String,var age : Int){
  override def toString = {
    this.name + "---"
  }
}
class  Dog(name:String, age:Int,var hobby:String)extends Animal(name,age){
  override def toString: String = this.name+"!!!!!"
}