package basicconcepts

object Sandbox {
  def main(args: Array[String]): Unit = {
    val day:String = "MON"
    val week = day match { case "MON" => "Weekday" case "Sat" => "Weekend" }
    println(week)
  }
}