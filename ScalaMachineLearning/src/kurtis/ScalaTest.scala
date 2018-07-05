package kurtis

/**
   * Scala Test Questions
   * 1. What is 2 to the power of 5?
   * 2. What is the remainder of 180 divided by 7?
   * 3. Given variable pet_name = "Sammy", use string interpolation to print out
 				"My dog's name is Sammy."
   * 4. Use scala to find out if the letter sequence "xyz" is contained in:
				"sadfjshfjyuyxyzjkfuidkjklhasyysdfk"
   * 5. What is the difference between a value and a variable?
   * 6. Given the tuple (1,2,3,(4,5,6)) retrieve the number 6.
*/
object ScalaTest {
  def main(args: Array[String]): Unit = {
    var answerOne:Double = Math.pow(2, 5)
    var answerTwo:Double = 180 % 7
    var answerThree:String = "Sammy"
    var answerFour:String = "sadfjshfjyuyxyzjkfuidkjklhasyysdfk"
    var answerSix = (1,2,3,(4,5,6))
    
    // question 1
    println(s"1. 2 to the power of 5 is ${answerOne}.")
    
    // question 2
    println(s"2. The remainder of 180 divided by 7 is ${answerTwo}.")
    
    // question 3
    println(s"3. My dog's name is ${answerThree}.")
    
    // question 4
    if (answerFour.contains("xyz")) {
      println(s"4. the string ${answerFour} contains the sequence xyz.")
    } else {
      println(s"4. the string ${answerFour} doesn't contain the sequence xyz.")
    }
    
    // question 5
    println("5. A variable is mutable, a value is immutable")
    
    // question 6
    println(s"6. ${answerSix._4._3}")
  }
}