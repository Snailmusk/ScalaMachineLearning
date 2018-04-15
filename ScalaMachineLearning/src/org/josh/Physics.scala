package org.josh

object Physics {
  def distance(metersPerSecond: Double, seconds: Double) = metersPerSecond * seconds
  def main(args: Array[String]): Unit = {
    val velocity = 4
    val time = 2
    val velocities = List(1, 2, 3, 4)
    val velocitiesequal = velocities.foreach { x => println(distance(x, time)) }
    println(velocitiesequal)
    val result = velocities.map { x => distance(x, time) }
    println(result)
    result.foreach(x => println(distance(x, time)))
    val resultstring = result.map { x => x.toString() + " m/s^2" }
    println(resultstring)
  }
}