package org.jpractice.scala.oop

object ScalaClass {


  def main(args: Array[String]): Unit = {

    // 调用默认的辅助构造函数
    var user2 = new User()

    // 调用只有一个参数的辅助构造函数
    var user3 = new User("mgf")


    var user = new User("xf",32,"nj")
    println(user.name)
    user.printAge()

    user.printAdd()

    user.name = "xyr"
//    user.age = 8

    println(user.name)
    user.printAge()

  }

}

/**
 * 对于class的构造函数变量
 *
 *           Getter?      Setter?
 * -------------------------------------------
 * var         yes          yes
 * val         yes          no
 * default     no           no
 *
 * 可以通过private关键字将变量设为私有,就不能在类之外的地方使用该变量
 * @param name
 * @param age
 */
class User(var name: String, age : Int,private var addr:String){

  def this(){
    this("my",33,"nj")
  }

  def this(name:String){
    this(name,55,"nj")
  }

  def printAdd(): Unit ={
    println(addr)
  }

  def printAge() :Unit = {
    println(age)
  }
}
