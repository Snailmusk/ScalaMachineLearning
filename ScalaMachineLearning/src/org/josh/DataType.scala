package org.josh

object DataType {
  //*Type* is the KIND of data you are working with; classification of data.
  //Numeric (Int, double, etc) and nonnumeric types (String).
  //Defines values and variables.
  //Scala types exist in hierarchy. 
  //Byte > Short > Int > Long > Float > Double. 
  //Char is the only tpe that could also appear in numeric data types.
  var x:Double = 3.5
  var y:Int = 3
  var z:Boolean = (5==6)
  //boolean returns false
  var a:Boolean = (6==6)
  //boolean returns true
  var b:Char = 'a'
  //Char is below hierarchy of int. 'a' has code of 97.
  val s = "hello"
  val add = y+x + s
  def main(args: Array[String]): Unit = {
    println(add)
    println(b + y)
    //compiler made a double and an int into a string
  }
}
