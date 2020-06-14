package com.lktbz.scala.day01

/**
 * 定义属性   03
 */
object VarDemo  extends App {
  var x=1;
  var y=x+2;
  print(y)
  //后面不需要使用标点
  // 方式一：
  var s="hello"; //String
  val i=42   //int
  var p=new Person("zs")  //object
  //方式二
  val ss: String = "hello"
  var ii: Int = 42
  /**
   * var 与val 的区别
   * The difference between val and var is that val
   * makes a variable immutable — like final in Java —
   * and var makes a variable mutable.
   * Because val fields can’t vary,
   * some people refer to them as values rather than variables.
   *var 变量
   * val 是不变，类似java final
   */
  val a='a'
//    a='b'
var aa='a'
   aa= 'c'
  print(aa)

}

