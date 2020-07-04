package com.lktbz.scala.day07
/**
 * match 匹配
 */
object MatchDemo  extends App {
  var i=10
  val monthName = i match {
    case 1  => "January"
    case 2  => "February"
    case 3  => "March"
    case 4  => "April"
    case 5  => "May"
    case 6  => "June"
    case 7  => "July"
    case 8  => "August"
    case 9  => "September"
    case 10 => "October"
    case 11 => "November"
    case 12 => "December"
    case _  => "Invalid month"
  }
  def convertBooleanToStringMessage(bool:Boolean):String={
    if(bool)"true" else "false"
  }
  println(convertBooleanToStringMessage(true))
  println(convertBooleanToStringMessage(false))
  var boo=false
  def  convertBooleanToStringMessage2(bool:Boolean):String=bool match {
    case true=>"you said true"
    case false=>"you said false"
  }
  val result = convertBooleanToStringMessage2(true)
  println(result)


//多个条件组合
  def isTrue(a:Any)=a match {
    case 0|""=>false
    case _=>true
  }

  val evenOrOdd = i match {
    case 1 | 3 | 5 | 7 | 9 => println("odd")
    case 2 | 4 | 6 | 8 | 10 => println("even")
    case _ => println("some other number")
  }
var count=10
  //使用if条件
  count match {
    case 1 => println("one, a lonely number")
    case x if x == 2 || x == 3 => println("two's company, three's a crowd")
    case x if x > 3 => println("4+, that's a party")
    case _ => println("i'm guessing your number is zero or less")
  }


}
