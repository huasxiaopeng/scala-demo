package com.lktbz.scala.day04

/**
 * set
 */
object SetDemo extends  App {
  //创建并复制
  val set = scala.collection.mutable.Set[Int]()
  set += 1
  set += 2 += 3
  set ++= Vector(4, 5)

  println(set)

  //插入重复与不重复的数据
  set.add(6)
  println(set)
  println(set.add(5))

  //jian
  set -= 1
  println(set)
  set -= (2, 3)
  println(set)
  set --= Array(4,5)
  println(set)

}
