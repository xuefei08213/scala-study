package org.jpractice.scala.basic

object ScalaLoop {

  def main(args: Array[String]): Unit = {

    // 先校验在执行
    var x = 0
    while (x < 10){
      println("x = " + x)
      x += 1
    }

    // 先执行再检查
    var y = 0
    do {
      println("y = " + y)
      y += 1
    }while (y < 10)

    for(i <- 1 to 5){
      println("i using to " + i)
    }

    for(i <- 1.to(5) ){
      println("i using to " + i)
    }

    // <- 将值赋予i
    for(i <- 1.until(6) ){
      println("i using to " + i)
    }

    // 循环嵌套
    for(i <- 1 to 9; j <- 1 to 3){
      println("i using multiple ranges " + i + " " + j)
    }

    var lst = List(1,2,3,4,5,6)
    for(i <- lst){
      println("i using lst " + i)
    }

    for(i <- lst;if i< 4){
      println("i using filter " + i)
    }

    var result = for{i <- lst;if i< 4} yield{
      i * i
    }

    println("result = " + result)
  }

}
