package com.lktbz.scala.day03

/**
 * 多实现方式 02
 */
object MultipleInterfaceDemo {
  trait Speaker {
    def speak(): String
  }

  trait TailWagger {
    def startTail(): Unit
    def stopTail(): Unit
  }

  trait Runner {
    def startRunning(): Unit
    def stopRunning(): Unit
  }
  //使用with 进行多继承
 class  dog extends Speaker with TailWagger with Runner {
   override def speak(): String = "Woof!"

   override def startTail(): Unit =  println("tail is wagging")

   override def stopTail(): Unit = println("tail is stopped")

   override def startRunning(): Unit = println("I'm running")

   override def stopRunning(): Unit = println("Stopped running")
 }


}
