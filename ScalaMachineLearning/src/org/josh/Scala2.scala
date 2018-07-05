package org.josh

object scala2 {
  //Every value is an object, and every operation is a method call.
  //Pure object oriented language. Interoperability. Libraries can be referenced interconnectedly.
  //Compiled by Java bytecode, so is compiled on a Java Virtual Machine.
  //A literal is data that appears directly in the source code.
  //EG: number 5, character A, text "Hello world."
  //(x: Int) => x + 2 is a function literal; represents value in Int => Int function.
  //^^^^^^^^^^^^^^^^^ is an anonymous function; no values assigned to function.
   def main(args: Array[String]): Unit = {
     val str = "Hello"
     //Anonymous value; not bound to a named variable.
     val double = 5l
     //More literals: 5l = long, 5f = float, 5d = double. Case insensitive.
     println(s"$str Joshua")
     println(double)
     //processed string
   }
}