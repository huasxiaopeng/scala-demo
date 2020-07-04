package com.lktbz.scala.day08

/**
 * 闭包
 */
object CloseBagDemo extends App {
    def mybly(factor:Double)=(x:Double)=>x*factor
   var a = mybly(3)
   var b = mybly(0.5)
    println(a(2) + b(9))
    println("==========")
  //currying 柯里化
  //将函数中的两个函数变为一个函数，并且把原来函数的第二个参数当做参数
  def add(a:Int) = (b:Int) => a+b
  var temp = add(1)(2)
  println(temp)
  println("==========")
  //简单定义柯里化
  def addnew(a:Int)(b:Int) = a+b
  var cc = addnew(12)(22)
  println(cc)
  println("==========")
  //柯里化的简单应用
  def trimul(a:Int)(b:Int)(c:Int) = a * b * c
  var tries = trimul(2)(4)(5)
  println(tries)

}
