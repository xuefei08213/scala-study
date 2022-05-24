package org.jpractice.scala.oop

abstract class Polygon {

  def area :Double

}

object Polygon {
  def main(args: Array[String]): Unit = {
//    var poly = new Polygon
//    printArea(poly)
    var rectangle  = new Rectangle(55.2,10.2)


    printArea(rectangle)

    var tri =new Triangle(55.2,10.2)
    printArea(tri)
  }

  def printArea(p: Polygon): Unit ={
    println(p.area)
  }
}
