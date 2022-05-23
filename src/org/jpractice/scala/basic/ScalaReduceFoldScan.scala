package org.jpractice.scala.basic

/**
 * Scala - Reduce,fold or scan (Left/Right)
 * reduceLeft,reduceRight,foldLeft,foldRight,scanLeft,scanRight
 */
object ScalaReduceFoldScan {

  val lst = List(1,2,3,4,5,7,10,13)
  var lst2 = List("A","B","C")

  def main(args: Array[String]): Unit = {

    /**
     * 从左侧开始做binary operate
     * 如果元素是数字类型则做算数运算
     * 如果元素是字符串类型则做字符串拼接
     */
    println(lst.reduceLeft(_ + _))
    println(lst2.reduceLeft(_ + _))

    println(lst.reduceLeft((x,y) => {
      println(x + " , " + y)
      x + y
    }))

    /**
     * 从右侧开始做binary operate
     * 如果元素是数字类型则做算数运算
     * 如果元素是字符串类型则做字符串拼接
     */

    println(lst.reduceRight((x,y) => {
      println(x + " , " + y)
      x - y
    }))

    /**
     * foldLeft和reduceLeft的区别在于，floatLeft需要传入计算的开始值
     */
    println(lst.foldLeft(0)(_ + _))
    println(lst2.foldLeft("z")(_ + _))

    /**
     * scanLeft会输出中间的计算结果
     */
    println(lst.scanLeft(10)(_ + _))
    println(lst2.scanLeft("z")(_ + _))

  }


}
