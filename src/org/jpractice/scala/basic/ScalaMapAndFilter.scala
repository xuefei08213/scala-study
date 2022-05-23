package org.jpractice.scala.basic

object ScalaMapAndFilter {

  val lst = List(1,2,3)
  val map = Map(1 -> "xf",2->"my",3->"xyr")

  def main(args: Array[String]): Unit = {
    println(lst.map(_ * 2))

    println(lst.map(x => x + 2))

    println(lst.map(x => "hi"+x))

    println(lst.map(x => "hi"*x))

    println(map.map(x => "hi" + x))

    println(map.mapValues(x => "hi " + x))

    println("hello".map(_.toUpper))

    println(List(List(1,2,3),List(3,4,5)).flatten)

    println(lst.map(x => List(x,x+1)))

    // 先进行map再进行flatten操作
    println(lst.flatMap(x => List(x,x+1)))


    println(lst.filter(x => x%2 != 0))

  }

}
