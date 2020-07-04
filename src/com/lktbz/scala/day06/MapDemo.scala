package com.lktbz.scala.day06

object MapDemo  extends App {
    val m=Map(
      1 -> "a",
      2 -> "b",
      3 -> "c",
      4 -> "d"
   )
  //for each
  for ((k,v)<-m)printf("key:%s,value:%s\n",k,v)

  println("获取全部的key"+m.keys)
  println("获取全部的values"+m.values)

  println("是否包含某个元素"+m.contains(3))
  //转换值
  println(m.transform((k,v)=>v.toUpperCase))

//tongguokey 进行过滤
  println(m.view.filterKeys(Set(2,3)).toMap)

  //怎么获取前几个元素
  println(m.take(2))

  //可变map
  val states = scala.collection.mutable.Map(
    "AL" -> "Alabama",
    "AK" -> "Alaska"
  )
  //add
  states+=("AZ" -> "Arizona")
  states += ("CO" -> "Colorado", "KY" -> "Kentucky")
  //remove
  states -= "KY"
  states -= ("AZ", "CO")


  //update
  states("AK") = "Alaska, The Big State"

  println(states.retain((k,v) => k == "AK"))



}
