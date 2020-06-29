package com.lktbz.scala.day06

object SampleLists extends App {

    val nums= (1 to 10).toList;
    val names = List("joel", "ed", "chris", "maurice")

   val doubles=nums.map(_ * 2)
    println(doubles)
   val sd= nums.map(i=>i*2)
    println(sd)

  //变大写
  val capNames =names.map(_.capitalize)
   println(capNames)

  val lessThanFive = nums.map(_ < 5)
  println(lessThanFive)


  val lessThanFives = nums.filter(_ < 5)
  println(lessThanFives)
  val evens = nums.filter(_ % 2 == 0)
  println(evens)

  val shortNames = names.filter(_.length <= 4)
  println(shortNames)

  names.foreach(println)

  nums.filter(_ < 4).foreach(println)

  println(nums.head)
  println(names.head)


  println(nums.tail)
  println(names.tail)


  println(nums.take(1))
  println( nums.take(2))
  println( names.take(1))
  println( names.take(2))



  println( nums.takeWhile(_ < 5))
  println(names.takeWhile(_.length < 5))

  println( nums.drop(1))
  println( nums.drop(5))

  println( nums.dropWhile(_ < 5))
  println(names.dropWhile(_ != "chris"))


}
