package org.jpractice.scala.basic

/**
 * 在scala中函数是一等公民
 * 可以将函数赋值给一个变量
 */
object ScalaFunction {

  object Math {
    // scala中可以给参数设置默认值，在调用时如果没有传入对应的参数则取默认值进行计算
    def add(x: Int = 14, y: Int = 12): Int = {
      x + y
    }

    def square(x: Int): Int = x * x

    // 在scala中符号也可以作为函数名
    def **(x: Int) = x * x

  }

  // 返回类型为Unit表示该函数没有返回值
  def print(x: Int, y: Int): Unit = {
    println(x + y)
  }

  def add(x: Int, y: Int): Int = {
    return x + y
  }

  // 函数的最后一行会被视为函数的返回值，return可以省略
  def subtract(x: Int, y: Int): Int = {
    x - y
  }

  def multiply(x: Int, y: Int): Int = return x * y

  def divide(x: Int, y: Int): Int = x / y

  def main(args: Array[String]): Unit = {

    // 可以将函数赋值给一个变量
    var add  = (x:Int,y:Int)=>x+y
    println(add(1,2))

    println(Math.**(3))
    println(3 * 3)
    print(200, 300)
    println(Math.add()) //  采用默认值进行计算 14+12=26
    println(Math.add(2)) // 第二个参数采用默认值进行计算 2 + 12=14
    println(Math.add(2, 4))

    // 对于只有一个参数的方法可以按照以下方式调用
    println(Math square 3)

    println(add(1, 2))
    println(subtract(1, 2))
    println(multiply(1, 2))
    println(divide(1, 2))
  }

}
