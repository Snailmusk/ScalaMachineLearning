package org.joshExercises

class Name(val name: String) {
   
  }
      
object NameSizes{
  def main(args: Array[String]): Unit = {
  val names = List(new Name("Greg"), new Name("Sally"), new Name("Bartholomew"))
  val size = names.map(_.name.size > 5)
  println(size)
  }
}