package com.lktbz.scala.day02

/**
 * 对象的抽象等一系列
 */
object AbsScalaDemo extends App {

  sealed trait DayOfWeek //抽象类
    case object Sunday extends DayOfWeek
    case object Monday  extends DayOfWeek
    case object Tuesday  extends DayOfWeek
    case object Wednesday  extends DayOfWeek
    case object Thursday  extends DayOfWeek
    case object Friday   extends DayOfWeek
    case object Saturday  extends DayOfWeek
}
