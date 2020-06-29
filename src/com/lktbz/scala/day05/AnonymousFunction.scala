package com.lktbz.scala.day05

import java.util

/**
 * 匿名函数
 */
object AnonymousFunction  extends App {
  val ints = List(1,2,3)
  val ps= List.range(1,10);
  println(ps)

  val sd=ints.map(_ * 2) //_ 匿名函数指的是List(1,2,3)
  println(sd)
  ints.map((i:Int)=>i*2)//等价于上面的
  ints.map(i=>i*2)//还等价于这样

  /**
   * List<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3));
   *
   * // the `map` process
   * List<Integer> doubledInts = ints.stream()
   * .map(i -> i * 2)
   * .collect(Collectors.toList());
   * 上面的Java代码可以转换成scala
   */
  val ds =for (i<-ints)yield i*2
   println(ds)
//过滤
  val x=ps.filter(_>5)
   val y= ps.filter(_<5)
  println(x)
  println(y)
   val s =ps.filter(_%2==0)

  println(s)
}
