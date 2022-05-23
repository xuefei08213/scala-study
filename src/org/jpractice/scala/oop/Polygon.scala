package org.jpractice.scala.oop

class Polygon {

  def area :Double = 0.0

}

object Polygon {
  def main(args: Array[String]): Unit = {
    var poly = new Polygon
    printArea(poly)
  }

  def printArea(p: Polygon): Unit ={
    println(p.area)
  }
}
