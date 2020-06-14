package com.lktbz.scala.day01

/**
 * String and char 06
 */
object StringAndCharType  extends App {

  //String and Char
  var name="Bill"
  var ccc='a'

  val firstName = "John"
  val mi = 'C'
  val lastName = "Doe"

  val names = firstName + " " + mi + " " + lastName

 // print(names)

  //scala 提供了更方便的组装字符串方式
  val namess=s"$firstName $mi $lastName"
//  print(namess)

//  println(s"$firstName $mi $lastName")
//
//  println(s"name:${firstName} ${lastName}")
//
//  println(s"1+1=${1+1}")


//  多线路strings

//  val speech = """Four score and
//               seven years ago
//               our fathers ..."""
//  print(speech)


//  val speech = """Four score and
//                 |                seven years ago
//                 |                our fathers ..."""

//  print(speech)
  /**
   * 多字符串的换行
   */
 val speed=
   """  foflmklm
     | sssmkmdsds
     | ddd""".stripMargin
  println(speed)
}
