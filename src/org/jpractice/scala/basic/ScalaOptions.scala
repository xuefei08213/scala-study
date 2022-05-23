package org.jpractice.scala.basic

object ScalaOptions {

  val lst = List(1,2,3)
  val map = Map(1 -> "xf",2->"my",3->"xyr")

  val opt : Option[Int] = Some(5)

  def main(args: Array[String]): Unit = {

    println(lst.find(_ > 2).getOrElse(0))

    println(map.get(5).getOrElse("mgf"))

    println(opt.isEmpty)

    println(opt.get)

  }

}
