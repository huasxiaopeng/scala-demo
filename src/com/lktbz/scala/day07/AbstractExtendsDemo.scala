package com.lktbz.scala.day07



/**
 * 抽象类使用
 */
class AbstractExtendsDemo {

}
//抽象类
abstract class Animal{
  def  cry
  def run={
    println("---------")
  }
}
class Dogs extends Animal{
  def cry: Unit ={ println("wangwangwang")}

  override def run: Unit = {
    super.run
    println("gogogugou")
  }
}
object main{
  def main(args: Array[String]): Unit = {
    var d = new Dogs
    d.cry
    d.run
    //类型检查
    println(d.isInstanceOf[Dogs])
    println(d.isInstanceOf[Animal])

    //精准类型匹配
    println(d.getClass)
    println(d.getClass==classOf[Dogs])
    println(d.getClass==classOf[Animal])

    //模式匹配
    def matchTest(x:Any):Any= x match {
      case 1 =>"this is 1"
      case 2 =>"this is 2"
      case _ =>" donot know what is it"
    }
    println(matchTest(1))
    println(matchTest(4))
  }
}
