package com.lktbz.scala.day02

object CreateObjectDemo extends App{
  //创建对象方式一：
   class Person(var firstName: String,var lastName:String)
    val p=new Person("bill","lk")
    println(p.toString)
   p.lastName="zs"
  //创建read-only
  class  Pers(val firstName:String,val lastName:String)
   val ps=new Pers("ss","sf")
   println(ps)
   //ps.firstName="jdhs" 报错，不能进行设置
  class Pizza(
             var size:Int,
             var cdtype:String
             )
  class Stock(val symbol: String,var price:BigDecimal)
  class Socket(val timeout: Int, val linger: Int) {
    //重写string 方法
    override def toString = s"timeout: $timeout, linger: $linger"
  }


}
