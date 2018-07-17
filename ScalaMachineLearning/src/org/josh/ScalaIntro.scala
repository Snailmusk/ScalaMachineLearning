package org.josh


object ScalaIntro {
  val x:Int = 5
  val y:Int = 2
  //VALUE: Immutable storage unit. Can be assigned data when it is 
  //defined, but can never be reassigned.
  //val <name>: <type> = <literal>
  def main(args: Array[String]): Unit = {
  val multiply = x * y
  println(multiply)
  }
}