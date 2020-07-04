package com.lktbz.scala.day07
//元祖集合，跟list 类型差不多，元组中的元素类型可以不同
object DemoCollection  extends  App {
  var t=(1,"bbb",12)
  //访
  println( t._1)
  println( t._2)
  println( t._3)

  var list1 = List("001","002","003")
  var list2 = List("aa","bb","cc")
 var par= list1.zip(list2);
  println(par.toMap)//Map(001 -> aa, 002 -> bb, 003 -> cc)
}
