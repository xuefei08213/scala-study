package org.jpractice.scala.basic

/**
 * 将多个参数的函数转换为单个参数的函数
 */
object ScalaCurrying {

  def add(x:Int,y:Int) = x + y

  def add2 (x:Int) = (y:Int) => x+y

  // 简单写法

  def add3 (x:Int)(y:Int) = x+y

  def main(args: Array[String]): Unit = {
    println(add(20,10))

    println(add2(20)(10))

    val sum40 = add2(40)
    println(sum40(100))

    println(add3(100)(200))

    val sum50 = add3(50)_
    println(sum50(40))
  }

}
