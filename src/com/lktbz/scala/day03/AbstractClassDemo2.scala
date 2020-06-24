package com.lktbz.scala.day03

/**
 * 抽象类
 */
object AbstractClassDemo2  extends  App {
  abstract  class Pet(name:String){
    def  speak()=println("YOPP")
    def comeToMaster()
  }
  class  Dog(name:String)extends Pet(name) {

    override def speak(): Unit = println("woof")
    def comeToMaster(): Unit = println("zxx")

  }


}
