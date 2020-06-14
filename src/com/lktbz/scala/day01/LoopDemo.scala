package com.lktbz.scala.day01

/**
 * 循环  08
 */
object LoopDemo extends App {
  val a = 1
  val b = 2
  if (a != b) println("值为" + (a * b))

  if (a == b) {
    println("==")
  } else {
    println("!=")
  }

  val boolean = false
  if (a == 3) {
    println(a)
  } else if (a == 4) {
    println(a)
  } else {
    println(a)
  }


  //返回值的result
  var minvalue = if (a < b) a else b
  println(minvalue)

  /**
   * 不满足执行两个，满足执行一个
   */
  if (a != b) println("简化" + a)
  println("简化" + b)

  /**
   * for demo
   *
   */
  var nums = Seq(1, 2, 3)
  for (n <- nums) println("遍历的值为" + n)
  /**
   * list
   */
  val people = List(
    "Bill",
    "Candy",
    "Karen",
    "Leo",
    "Regina",
  )
  for (p<-people)println("list foreach-->"+p)


  /**
   * method foreach
   */

  people.foreach(println)


  /**
   * Using for and foreach with Maps
   */
  val ratings = Map(
    "Lady in the Water"  -> 3.0,
    "Snakes on a Plane"  -> 4.0,
    "You, Me and Dupree" -> 3.5
  )

  for ((key,value)<-ratings)println(s"key->${key}:-->value is-->${value}");

  ratings.foreach{
    case (str, d) => println(s"key:${str}-->value:${d}")
  }

}
