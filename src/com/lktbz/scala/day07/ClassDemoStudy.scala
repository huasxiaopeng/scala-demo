package com.lktbz.scala.day07

import scala.beans.BeanProperty

/**
 * 类的基本应用
 */
object ClassDemoStudy extends App {
  class Counter{
    private  var vlue=0
    def setValue(a:Int)={
      vlue=a
    }
    def getValue={
       vlue
    }
    //注意BeanProperty只能用于处理非private的属性
    @BeanProperty
    var money=0
    //变量默认是公有的
    var age=0
    def this(vlue:Int){
      this
      this.vlue=vlue
    }
    def increment=vlue+=1

    def current() = vlue
    def current2 = vlue


  }
  var c=new Counter
  c.current()
  c.increment
  //因为定义的时候没有()所以在使用的时候必须不能带括号
  //如果调用c.current2()会出现错误
  c.current2
  //私有对象，不能这样访问
  //println(c.value)
  //c.value=22
  //访问公有变量
  c.age=1000
  println(c.age)
  c.setValue(110)
  println(c.getValue)

  c.setMoney(333)
  println(c.getMoney)
  //下面是主构造器 能够省去java代码中定义变量，写get
  //set的过程,如果定义主构造器中使用private,那么这个属性就是私有的
  class Dog(@BeanProperty var name:String,var age:Int,private var addr:String){
    //测试建立一个函数
    def changename(name:String){
      this.name = name
    }

    def getAddr() : String ={
      addr
    }
  }
  println("==========")

  var d = new Dog("dog1",12,"qqqq")
  println("Dog name " + d.name)
  println("Dog age " +d.age)

  println(d.getName())
  //因为没有在主构造函数中的age上添加 @BeanProperty，所以没有自动产生构造方法
//  println(d.getAge())

  d.changename("ccc")
  println("Dog name " + d.name)

  //由于是私有属性，所以不能直接访问，需要调用自己写的构造器
//  println(d.addr)
  println(d.getAddr())

}
