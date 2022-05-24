package org.jpractice.scala

object ScalaLazy {


  def method1(n:Int): Unit ={
    println("Method1")
    println(n)
  }

  def method2(n: =>Int): Unit ={
    println("Method2")
    println(n)
  }

  def main(args: Array[String]): Unit = {


    val add = (a:Int,b:Int) => {
        println("Add")
        a+b
    }

    /**
     * 输出顺序如下
     * Add
     * Method1
     * 3
     */
    method1(add(1,2))

    /**
     * Method2
     * Add
     * 3
     */
    method2(add(1,2))


    val x = new strict
    println(x.e)
    val y = new LazyEval
    println(y.l)
  }

}

class strict {
  val e = {
    println("strict")
    9
  }
}

class LazyEval {
  lazy val l = {
    println("lazy")
    9
  }
}
