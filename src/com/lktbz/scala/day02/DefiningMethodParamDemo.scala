package com.lktbz.scala.day02

object DefiningMethodParamDemo  extends  App {
//定义一个输入参数的方法、
    def double(a:Int)=a*2;
   println(double(2))
   println(double(5))
   println(double(199))
//展示返回值类的方法
  def doumbn(a:Int):Int=a*4
  //定义的时候，发现会类型推断出Int

  //多个输入方法的参数
  def  add(a:Int,b:Int)=a*b
  println(add(6,10))

  def add2(a: Int, b: Int): Int = a + b

  def add(a: Int, b: Int, c: Int): Int = a + b + c

  //多个方法定义：

  def addThenDouble(a:Int,b:Int)={
    val sum=a+b
    val doubled=sum*2
     doubled //可以理解成返回
  }
  println(addThenDouble(10,2))



}
