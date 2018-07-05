package kurtis

object Refresh {
  /*
   * val is immutable
   * var is mutable
   * <declaration> <name>:<type> = <value>
   */
  
  val helloWorld:String = "Hello World"
  
  var helloCount:Integer = 0
  helloCount += 1
  
   
  def main(args: Array[String]): Unit = {
    val helloWorldDisplay:String = s"Hello World. Count = ${helloCount}"
    println(helloWorldDisplay)
    
    val evens = List(2,4,6,8,10)
    println(s"${evens.head} ${evens(2)} ${evens.last}")
  }
}