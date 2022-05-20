package org.jpractice.scala.basic

object ScalaString {

  def main(args: Array[String]): Unit = {
    val name = "xuefei"
    val age = 32
    val salary = 123.3

    // 字符串的使用
    println(name + " is " + age + " years old and salary is "+salary)
    println(s"$name is $age years old and salary is $salary")
    println(f"$name%s is $age%d years old and salary is $salary%f")
    println(s"Hello \nworld") // \n输出的内容会换行
    println(raw"Hello \n world") // 输出为纯文本，输出不会换行

  }

}
