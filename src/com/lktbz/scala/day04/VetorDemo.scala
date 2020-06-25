package com.lktbz.scala.day04

import com.lktbz.scala.day01.Person

object VetorDemo  extends  App {
  //创建
  val nums=Vector(1 , 2 , 3,4 ,5,6)
  val strings=Vector("liz","sd")
  val peer=Vector(
    Person("ls"),
    Person("hd"),
    Person("nsd"),
    Person("jfd")
  )


  val a=Vector(1,3,4)
  val b=a:+4
  println(b)

  val c=a++Vector(7,8)
  println(c)
  val d=c++Vector(5,6)
  println(d)


  val nams=Vector("jon","Cghe","ED")
  for (n<-nams)println(n)
}
