package org.joshExercises

object LPrimeFactor {
  def main(args: Array[String]): Unit = {
    var x = 0l
    var y = 0l
    var num = 600851475143l
    while (x < num) {
      y = x
      while (y != 0) {
        if (x % y == 0) {
          println("is not prime")
        } else {
          y = y - 1
        }
      }
    }

  }
}