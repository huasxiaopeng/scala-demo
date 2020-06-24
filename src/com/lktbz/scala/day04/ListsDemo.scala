package com.lktbz.scala.day04

/**
 *  list demo
 */
object ListsDemo extends  App {
    //creating lists
    // NO:1
  val ins=List(1,2,3)
  val names=List("tom","jeck","eed")
  //NO:2 不推荐
  val inss:List[Int]=List(1,2,4)
  val namess:List[String]=List("tom","jeck","eed")


  //Adding elements to a List

  val a = List(1,2,3)
  val b=0+:a

  println(b)
  val c=10+:b
  println(c)
   val d= 11+:c

  //添加list 后面
  val e=d:+15
  println(e)
}
