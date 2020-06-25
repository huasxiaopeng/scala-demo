package com.lktbz.scala.day04

/**
 * map
 */
object MapDemo  extends App {
  val states=Map(
//      "alk" -> "russa" ,
//      "qub" -> "china" ,
//      "ma41a" -> "usa",
//      ""
      "AK" -> "Alaska",
      "IL" -> "Illinois",
      "KY" -> "Kentucky"
  )

  ///创建可变的map

 val ss= collection.mutable.Map("zs"->"lk")
  println(ss)
  //add
   ss+=("gl"->"dsn")
   ss+= ("hd"->"kf","suhjf"->"hfjd")
  println(ss)

  ss++=Map("CA" -> "California", "CO" -> "Colorado")

  println(ss)

  ss-=("CO","gl")
  println(ss)

  //减元素
  ss-="CA"
  println(ss)


  ss --= List("zs", "suhjf")

  //修改
  ss("hd")="hello scala Map"
  println(ss)

  //遍历
  val ratings = Map(
    "Lady in the Water"-> 3.0,
    "Snakes on a Plane"-> 4.0,
    "You, Me and Dupree"-> 3.5
  )

  for ((k,v)<-ratings)println(s"key:$k--value:$v")

  //for each
  ratings.foreach{
    case (k,v)=>println(s"key=$k+value$v")
  }

}
