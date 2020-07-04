package com.lktbz.scala.day07

import scala.beans.BeanProperty

/**
 *  伴生对象
 */
class ObjectMainDemo {

}

class Car {
  @BeanProperty
  var color = "yellow"
}

//下面的伴生对象本质上是java中的静态成员。伴生对象和类能够相互访问，访问的规则遵循java中静态和非静态间的访问规则
object Car{
  var staticvalue = "this is static"

}
//  object  main{
//    def main(args: Array[String]): Unit = {
//        var c = new Car
//        println(c.color)
//        c.setColor("red")
//        println(c.getColor)
//        println(Car.staticvalue)
//    }
//  }
