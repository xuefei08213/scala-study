package org.jpractice.scala.basic

object ScalaString {


  val num1 = 75
  val num2 = 100.25
  val str1 : String = "Hello World"
  val str2 : String = "Max"



  def main(args: Array[String]): Unit = {

    println(str1.length)
    println(str1.concat(str2))
    println(str1 + str2)

    val result = printf("(%d -- %f -- %s)",num1,num2,str1)
    println(result)
    println("(%d -- %f -- %s)".format(num1,num2,str1))
    printf("(%d -- %f -- %s)",num1,num2,str1)





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
