package com.lktbz.scala.day03

/**
 * 抽象03
 */
object AbstractClassDemo extends  App {
  trait  pet{
    def speak=println("YO")  //具体的实现类
    def comToMaster() //抽象方法
  }
  //重写抽象方法
  class Dog(name:String) extends pet {
    override def comToMaster(): Unit = println("实现了抽象方法")
  }
  val pp=new Dog("zs")
  pp.comToMaster()
  //覆盖方法
  class  cat extends pet {

    override def speak: Unit = println("mw")

    def comToMaster(): Unit = println("这是只cat")
  }
  val c = new cat
  c.speak
  c.comToMaster()


  trait Speaker {
    def speak(): String   //abstract
  }

  trait TailWagger {
    def startTail(): Unit = println("tail is wagging")
    def stopTail(): Unit = println("tail is stopped")
  }

  trait Runner {
    def startRunning(): Unit = println("I'm running")
    def stopRunning(): Unit = println("Stopped running")
  }
  class Dog1(name: String) extends Speaker with TailWagger with Runner {
    def speak(): String = "Woof!"
  }

  class Cat1 extends Speaker with TailWagger with Runner {
    def speak(): String = "Meow"
    override def startRunning(): Unit = println("Yeah ... I don't run")
    override def stopRunning(): Unit = println("No need to stop")
  }
  val d1= new Dog1("lktbz")
  d1.speak()
  d1.startRunning()
  val c1 = new Cat1
  c1.startRunning()


  //在运行中继承、
  trait TailWagger1 {
    def startTail(): Unit = println("tail is wagging")
    def stopTail(): Unit = println("tail is stopped")
  }

  trait Runner1 {
    def startRunning(): Unit = println("I'm running")
    def stopRunning(): Unit = println("Stopped running")
  }
  class Dog2(name: String)
  val d = new Dog2("Fido") with TailWagger1 with Runner1
  d.startTail()
  d.stopRunning()
}
