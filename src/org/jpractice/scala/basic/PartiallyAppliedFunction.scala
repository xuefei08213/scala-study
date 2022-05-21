package org.jpractice.scala.basic

import java.util.Date

object PartiallyAppliedFunction {

  def log(date:Date,message:String) = {
    println(date+"   "+message)
  }

  def main(args: Array[String]): Unit = {
    val sum = (x:Int,y:Int,z:Int)=> x + y + z

    // 先传入两个参数，最后一个用_
    val f = sum(10,20,_:Int)

    // 传入被_代替的那个参数
    println(f(30))

    val date = new Date
    val newLog = log(date,_:String)
    newLog("The message 1")
    newLog("The message 2")
    newLog("The message 3")
    newLog("The message 4")
  }



}
