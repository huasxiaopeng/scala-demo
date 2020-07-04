package com.lktbz.scala.day01
import scala.util.control.Breaks._
/**
 * 强大的循环 09
 */
object forDemo  extends App {
  val nums=Seq(1,2,3)
  //遍历并且每个都加2
   var dinum=  for (n<-nums)yield n*2
    println(dinum)

    //字符串首字母大写
    val names = List("adam", "david", "frank")
    val Stde=  for(name<-names)yield name.capitalize
    println(Stde)

    //scala 循环是否返回知道 ，yeild 记录集合，并最后返回
   val drope= for (name<-names)yield name.drop(1).capitalize
    println(drope)

  //for 循环的中止条件 break ，需要导入
 breakable{
  for(i <- 1 to 10){
   if(i < 6){
    println(i)
   }else{
    break;
   }
  }
 }

}
