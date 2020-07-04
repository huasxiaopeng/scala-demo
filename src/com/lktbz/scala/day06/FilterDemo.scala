package com.lktbz.scala.day06

/**
 * 使用filter 过滤产生新的数组
 */
object FilterDemo extends App {
  val a= Array(1 to 10:_*)
   println(a.mkString)
  for (i<-a)println(i)


  //利用yield 返回数组
  var bb=for (i<- a if i%2==0) yield i*2
    for (s<-bb)println(s)


  //先过滤然后在转换
 var s= a.filter(_%2==0).map(_*3)
  for (ss<-s)println(ss)
}
