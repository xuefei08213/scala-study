package org.jpractice.scala.basic

/**
 * 闭包指的是函数可以使用函数之外的变量
 */
object ScalaClosures {

  var number = 10

  val add = (x:Int)=> {
    number = x + number
    number
  }

  def main(args: Array[String]): Unit = {
    number = 100
    println(add(20))
  }

}
