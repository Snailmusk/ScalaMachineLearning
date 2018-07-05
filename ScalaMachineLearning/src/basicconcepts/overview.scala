package basicconcepts

object overview {
  
  // val=value; typed storage unit, that cannot be changed/immutable

  def main(args: Array[String]): Unit = {
    // val <name>: <type> = <literal>
    val bob: Int = 5
    val y: Int = 7
    val a: Float = 5
    val b: Float = 7
    val z: String = "14"
    println(z + bob * y)
    println(a / b)
   println (5==6)
    //val bob: Int = 5
    //println(bob / dave) TYPE MISMATCH
    //dave has not been defined

  } //literal = data that appears directly in the source code, like the number 5, the character A, and the text, "Hello World".
}// var = mutable, typed storage unit. Can be reassigned at any time. 

// var <name> {: <type>} = <data>

// while the value pertaining to the varible can be chnaged the type 
// relating to the variable cannot
// scala does not allow conversions from higher ranked data types to lower ranked
// scala> var c:Int = b.toInt
//c: Int = =11
 