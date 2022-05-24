package org.jpractice.scala.basic

object ScalaMap {

  var myMap : Map[Int,String] = Map(1 -> "xf",2->"my",3->"xyr",3->"xyr1")

  val myMap2 : Map[Int,String] = Map(5 -> "zz",6 -> "yc")

  def main(args: Array[String]): Unit = {

    myMap += (33 -> "333")

    println(myMap)

    println(myMap(1))

    println(myMap.keys)

    println(myMap.values)

    println(myMap.isEmpty)

    myMap.keys.foreach{key => {
      println("key" + key)
      println("value" + myMap.get(key))
    }}

    println(myMap.contains(4))

    println(myMap ++ myMap2)

    println(myMap2.size)

  }

}
