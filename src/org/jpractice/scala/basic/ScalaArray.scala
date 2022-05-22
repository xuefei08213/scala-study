package org.jpractice.scala.basic


import Array._
object ScalaArray {

  val myArray:Array[Int] = new Array[Int](4)

  val myArray2 = new Array[Int](5)

  val myArray3 = Array(1,2,3,4)

  def main(args: Array[String]): Unit = {
    myArray(0) = 20
    myArray(1) = 30
    myArray(2) = 40
    myArray(3) = 50

    for(x <- myArray2){
      println(x)
    }

    for(i <- 0 to myArray.length -1){
      println(myArray(i))
    }


    val result = concat(myArray,myArray3)
    for(x <- result){
      println(x)
    }

  }

}
