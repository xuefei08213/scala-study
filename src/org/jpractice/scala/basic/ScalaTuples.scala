package org.jpractice.scala.basic

/**
 * 可以放不同类型的值
 * 最多存放22个值
 */
object ScalaTuples {

  val mytuple = (1,2,"hello",4)

  val mytuple2 = Tuple2("1","ee")
  val mytuple3 = Tuple3("r","u",("111","222"))

  def main(args: Array[String]): Unit = {
    println(mytuple._1)
    println(mytuple._2)
    println(mytuple._3)
    println(mytuple._4)

    mytuple3.productIterator.foreach{
      i => println(i)
    }

    println(mytuple3._3)

    // 只能存放一对
    println(1 -> "tom")

    println(1 -> "tom" -> true)


  }

}
