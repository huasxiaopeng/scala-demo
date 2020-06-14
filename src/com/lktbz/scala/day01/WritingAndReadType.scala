package com.lktbz.scala.day01

/**
 * 读写   07
 */
import scala.io.StdIn.readLine
object WritingAndReadType extends App {
  println("Hello, world")
  println("Hello without newline")
  //err打印
  System.err.println("xxxxxx")



  println("enter your first name:")
  val firstName=readLine()
  println("enter your last name")
  val lastName=readLine()
  println(s"your name:${firstName} ${lastName}")

}
