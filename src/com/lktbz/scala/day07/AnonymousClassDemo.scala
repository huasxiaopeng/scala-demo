package com.lktbz.scala.day07

/**
 * 匿名内部类
 */
object AnonymousClassDemo extends App {
  var ap=new Aperson
  ap.meet(new Person("sss"){
    def greeting:String=
      "hello"
  })
}
class Person(val name : String){

}
class  Aperson(){
  def  meet(p:Person{def greeting:String}): Unit ={
    println(p.greeting)
  }
}