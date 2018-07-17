package other

object Physics2 {
 def velocity(variableone: Double, variabletwo: Double) = variableone * variabletwo
 def main(args: Array[String]): Unit = {
   val distance = List(2, 4, 6, 8)
   val time = 7
   val intervals = distance.foreach{x => println(velocity(x, time))}
   println(intervals)
 }
}