package com.lktbz.scala.day03

/**
 * 接口 01
 */
object InterfaceDemo extends  App {
  //定义接口
   trait TailWagger{
     def startTail():Unit
     def stopTail():Unit
   }
  //实现类继承
//  class Dog extends TailWagger {
//    override def startTail(): Unit = println("lalla")
//
//    override def stopTail(): Unit = println("tttt")
//  }
//  //变量指向
//  val p=new Dog
//  //打印
//  p.startTail()
  //简写
  trait TailDemo{
    def startDemo()
    def stopDemo()
  }

  class  dd extends TailDemo {
    override def startDemo() = println("ddd")

    override def stopDemo()   = println("fff")
  }
  val ppp=new dd
  ppp.stopDemo()

}
