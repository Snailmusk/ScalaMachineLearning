package org.joshExercises

object EvenFib {
  def main(args: Array[String]): Unit = {
    var first = 1
    var second = 1
    var sum = 0
    while (second + first < 3999999) {
    	second = second + first
    	first = second - first
      if (second % 2 == 0) {
        sum = sum + second
      }
    }
    println(sum)

  }
}