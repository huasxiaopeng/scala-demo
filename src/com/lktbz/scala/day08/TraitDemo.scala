package com.lktbz.scala.day08

/**
 * 接口
 */
class TraitDemo extends Logger with Logger2  with Logger3  {
  override def log(msg: String): Unit = println(msg)
  def run(): Unit ={
    info("xxx")
  }
  def setName(s:String): Unit ={
    this.name=s
  }

}
trait Logger{
  //这里在java的接口中只能声明为静态的，在trait中能够声明成var,而不必须声明成val,trait可以简单的认为是抽象类和接口
  var name = "tom"
  def log(msg:String)
  def info(msg:String){
    log("INFO" + msg)
  }
  def warn(msg:String){
    log("WARN:" + msg)
  }

}
trait Logger2{
}

trait Logger3{
}
object main{
  def main(args: Array[String]): Unit = {
    var d = new TraitDemo
    d.log("heihei")
    d.run
    println(d.name)
    d.setName("aa")
    println(d.name)
  }
}