package org.jpractice.scala.oop

class Rectangle(var width: Double, var height: Double) extends Polygon {

  override def area: Double = width * height

}
