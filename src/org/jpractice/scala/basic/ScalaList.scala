package org.jpractice.scala.basic

import java.util

object ScalaList {

  val myList: List[Int] = List(1, 2, 4, 5, 6, 7, 8)
  val names: List[String] = List("xuefei", "my", "xyr")

  def main(args: Array[String]): Unit = {

    // 在列表开头插入元素
    println(0 :: myList)

//    println(12 :: 22: 44 :: Nil)

//    val result =
    println(myList)
    println(names)
    println(myList.head)
    println(myList.tail) // 获取除第一个元素之外的元素
    println(myList.isEmpty)

    println(myList.max)

    println(List.fill(5)(2,3))

    myList.foreach(e =>{
      println(e)
    })

    myList.foreach(println)

    var sum  = 0
    myList.foreach(sum += _)

    println(sum)

    for(name <- names){
      println(name)
    }

    println(names(0))

  }

}
