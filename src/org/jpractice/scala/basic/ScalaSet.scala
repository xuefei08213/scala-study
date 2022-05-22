package org.jpractice.scala.basic

/**
 * Set是无序的，且没有重复元素
 */
object ScalaSet {

  // 不可变Set
  val myset = Set(1,2,3,4,5,5)

  val myset2 = Set(2,3,4,7,8)

  // 可变Set
  var mutableSet = scala.collection.mutable.Set(1,2,3,4)

  def main(args: Array[String]): Unit = {

    // 查看8是否在集合中
    println(myset(8))

    println(myset.head)

    println(myset.tail)

    println(myset.isEmpty)

    // 合并两个集合，重复值会被删除
    println(myset ++ myset2)
    println(myset.++(myset2))

    // 获取两个集合的交集
    println(myset.&(myset2))

    // 获取两个集合之间相同的元素
    println(myset.intersect(myset2))

    println(myset.max)

    for(v <- myset){
      println(v)
    }


    println(myset)

    println(myset + 10)

    println(myset)

    println(mutableSet)

    println(mutableSet + 10)

    println(mutableSet)

  }

}
