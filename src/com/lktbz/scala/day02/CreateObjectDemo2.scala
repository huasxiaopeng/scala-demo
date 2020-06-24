package com.lktbz.scala.day02

/**
 * 构造函数
 */
object CreateObjectDemo2 extends App {
  val DefaultCrustSize = 12
  val DefaultCrustType = "THIN"
  //构造函数
  class  Pizza(var crustSize:Int,var crustType:String){
    //一个构造函数
      def  this(crustSize: Int){
        this(crustSize,DefaultCrustType)
      }
    //一个构造函数
    def this(crustType: String){
      this(DefaultCrustSize,crustType)
    }
    //空构造函数
    def this(){
      this(DefaultCrustSize,DefaultCrustType)
    }
    override def toString = s"A $crustSize inch pizza with a $crustType crust"


  }
  val p1 = new Pizza(DefaultCrustSize, DefaultCrustType)
  val p2 = new Pizza(DefaultCrustSize)
  val p3 = new Pizza(DefaultCrustType)
  val p4 = new Pizza
  println(p1)
  println(p2)
  println(p3)
  println(p4)



  //设置默认，并且赋值
  class pz(
          var siza:Int=DefaultCrustSize,
          var typs:String=DefaultCrustType
          )

  //scala 提供默认参数的构造函数
  //以socket 为例
  class Socket(var timeout: Int, var linger: Int) {
    override def toString = s"timeout: $timeout, linger: $linger"
  }
  class Sock(var timeout:Int=200,var linger:Int=3){
    override def toString =s"timeout:$timeout,linger:$linger"
  }
 var pp= new Sock()//使用默认值
  var ppp= new Sock(1000)//重写一个值
  var pppp=new Sock(4000, 6000)//两个值都重写
  println(pp)
  println(ppp)
  println(pppp)



}
