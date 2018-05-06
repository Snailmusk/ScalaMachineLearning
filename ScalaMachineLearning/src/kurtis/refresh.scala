package kurtis

object refresh {
  /*
   * val is immutable
   * var is mutable
   * variable syntax structures:
   * 	val <name>:<type> = <literal>
   * 	var <name>:<type> = <literal>
   */
  
  val helloWorld:String = "Hello World"
  
  var helloCount:Integer = 0
  helloCount += 1
  
   
  def main(args: Array[String]): Unit = {
    val helloWorldDisplay:String = helloWorld + " " + helloCount
    println(helloWorldDisplay)
  }
}