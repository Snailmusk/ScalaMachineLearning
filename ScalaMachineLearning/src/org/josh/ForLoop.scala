package org.josh

object ForLoop {
  def main(args: Array[String]): Unit = {
    
    for (item <- List(1,2,3)) {
      println(item)
    }
    
    for (x <- Array.range(0,5)) {
      if(x%2 == 0) {
        println(s"$x is even")
      }
      else{
        println(s"$x is odd")
      }
    }
    
    val names = List("Josh", "Abe", "Cindy", "Kat")
    
    for (name <- names) {
      if(name.startsWith("C")){
        println(s"$name starts with a C.")
      }
      else{
        println(s"$name doesn't start with a C.")
      }
    }
    
  }
}