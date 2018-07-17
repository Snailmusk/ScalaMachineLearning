package org.joshExercises

object MeanMedianMode {
  val numbers = List(3.2, 5.1, 8.7, 6.3, 7.4, 7.4).sorted
  def main(args: Array[String]): Unit = {
    //mean
    val value = numbers.sum
    val divisor = numbers.length
    println(value / divisor)
    //median
    if (numbers.length%2 == 0 ) {
    //even
    println(numbers.lift(numbers.length/2))
    println(numbers.lift((numbers.length/2) - 1))
    }
    else {
    //odd
    println(numbers.lift(numbers.length/2))
    }
    //mode
    println(numbers.groupBy(i => i).mapValues(_.size).maxBy(_._2)._1)
    
  }
}