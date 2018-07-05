package basicconcepts

object Sandbox {
    val day = "Jupiter"
    val week = day match { case "Monday" | "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "Weekday" case "Saturday" | "Sunday" => "Weekend" case _ => "not a day."}
    //'case _ => X' = Wildcard Operator; if the value does not correspond to match case, return 'X.'
    println(day + " is a " + week)
  
}