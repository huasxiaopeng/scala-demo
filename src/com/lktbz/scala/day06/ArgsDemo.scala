package com.lktbz.scala.day06

/**
 * 创建好函数后，参数如何进行传递
 */
object ArgsDemo  extends  App {
  def  sum(x:Int*)={
    var r=0;
    for(i<-x){
      r+=i
    }
     println(r)
    r
  }
  var c = sum(1,2,3,4,5)
  var b = sum(1 to 5: _*) //把1-5作为参数传递
  println(c)
  println("====================")
  println(b)
  println("====================")

}
