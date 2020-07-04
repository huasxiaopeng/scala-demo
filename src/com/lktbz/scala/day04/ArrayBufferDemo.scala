package com.lktbz.scala.day04
import scala.collection.mutable.ArrayBuffer
/**
 * 数组 首先需要注意的是Array是定长数组，而ArrayBuffer是可变数组。下面是一个小例子，对数据进行便利和修改的操作。
 */
object ArrayBufferDemo  extends App {
  //可变数组
    //定义
   val ins= ArrayBuffer[Int]()
   val names=ArrayBuffer[String]()
    ins+=1
     println(ins)
    ins+=2
     println(ins)

  //定义并赋值
  val nums=ArrayBuffer(1,2,3,4)
  nums.foreach(s=>println(s))


  //add one element
  nums+=4
  //add two element
  nums+=5 +=6
  //add list
  nums++=List(7,8,9)
  println(nums)

  //remove elemet
  nums-=9
  nums-=8 -=7
  println(nums)

  nums --=Array(4,2)
  println(nums)
  val a = ArrayBuffer(1, 2, 3)
  a.append(4)                          // ArrayBuffer(1, 2, 3, 4)
  a.append(5, 6)                       // ArrayBuffer(1, 2, 3, 4, 5, 6)
  a.appendAll(Seq(7,8))                // ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8)
  a.clear                              // ArrayBuffer()

  val a1 = ArrayBuffer(9, 10)           // ArrayBuffer(9, 10)
  a1.insert(0, 8)                       // ArrayBuffer(8, 9, 10)
  a1.insertAll(0, Vector(4, 5, 6, 7))   // ArrayBuffer(4, 5, 6, 7, 8, 9, 10)
  a1.prepend(3)                         // ArrayBuffer(3, 4, 5, 6, 7, 8, 9, 10)
  a1.prepend(1, 2)                      // ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  a1.prependAll(Array(0))              // ArrayBuffer(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  val a2= ArrayBuffer.range('a', 'h')  // ArrayBuffer(a, b, c, d, e, f, g)
  a2.remove(0)                          // ArrayBuffer(b, c, d, e, f, g)
  a2.remove(2, 3)                       // ArrayBuffer(b, c, g)

  val a3 = ArrayBuffer.range('a', 'h')  // ArrayBuffer(a, b, c, d, e, f, g)
  a3.trimStart(2)                       // ArrayBuffer(c, d, e, f, g)
  a3.trimEnd(2)                         // ArrayBuffer(c, d, e)


  //定长数组

  val nus=  new Array[Int](10)//必须定义
  val array1 = Array(1 to 10: _*);
  val strarray = Array("aa","bb","cc","dd")

  for (i<-array1)
    println("定长数组打印"+i)


  println(nus.mkString(","))
  for (i<-strarray)
    println("定长数组打印"+i)
  println("通用打印"+strarray.mkString(","))
}
