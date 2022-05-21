package org.jpractice.scala.basic

/**
 * 参数为函数并返回函数的函数称为高阶函数
 */
object ScalaHigherOrderFunction {

  def math(x:Double,y:Double,f:(Double,Double)=>Double):Double = f(x,y)

  def complexMath(x:Double,y:Double,z:Double,f:(Double,Double)=>Double):Double = f(z,f(x,y))

  def main(args: Array[String]): Unit = {

//    val result = math(2,4,(x,y)=>x+y)

    var result = complexMath(2,3,5,(x,y)=>x max y)

    // 上面的函数可以通过通配符来代替
    result = complexMath(2,3,5,_ max _)


    println(result)

  }

}
