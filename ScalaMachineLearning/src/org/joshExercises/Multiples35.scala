package org.joshExercises

object Multiples35 {
  def main(args: Array[String]): Unit = {
    var counter = 0
    var sum = 0
    while (counter < 999)
    {
      counter = counter + 1
      if (counter % 3 == 0) {
        sum = sum + counter
      } else if (counter % 5 == 0) {
        sum = sum + counter
      }
    }
    println(sum)
  }
}