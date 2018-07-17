package org.josh

object ClassesTraits {
  /*Abstract class is designed to be extended by other classes
  but not instantiated itself, designated by 'abstract' keyword.
  Reasons: Want to create bas class requiring constructor arguments.
  The cod ewill be called from Java code.

  Traits in general are more powerful and can be used in many cases.
  A class can extend multiple traits, but only one abstract class.
  Trait can be combined together with abstract class to take advantage
  of its constructor parameter.
  */
  trait Shape {
    def area: Int
    def name = "Shape"
  }
  
  trait Shape_new {
    def area : Int 
    
    final def name = "Shape"
  }
  abstract class Car {
    //values here not instantiated, as part of abstract class
    val year: Int
    def color: String
    val automatic: Boolean = true
  }

  class Rectangle(width: Int, height: Int) extends Shape {
    def area = width * height
  }
  
  class Rectangle_new(width: Int, height: Int) extends Shape {
    def area = width * height
    override def name: String = "Rectangle"
  }
  
  def main(args: Array[String]): Unit = {
    //val var1 = new Car() | doesn't work, can't be instantiated
    val s = new Shape {
      override def area: Int = 20
    }
    println(s.area)
    println(s.name)
    
    val table = new Rectangle(5, 8)
    println(table.area)
    println(table.name)
    
    val table_new = new Rectangle_new(4, 6)
    println(table_new.area)
    println(table_new.name)
    
    
    
  }
}