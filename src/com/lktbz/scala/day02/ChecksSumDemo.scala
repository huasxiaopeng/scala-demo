package com.lktbz.scala.day02

/**
 * 定义一个类，并添加一个属性sums
 */
class ChecksSumDemo {
  var sum=0
  private  var sum1=10 //私有属性
  //通过函数的方式访问
  def  add(b:Byte):Unit={
    sum1+=b
  }
  def  checksums():Int={
    return  ~(sum1&0xff)+1
  }
}
