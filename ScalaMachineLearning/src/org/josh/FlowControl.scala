package org.josh

object FlowControl {
  def main(args: Array[String]): Unit = {
    /* if(boolean) {
   * do something}
   * else if(boolean) {
   * do something else}
   * else if(boolean) {
   * do something else}
   */
    val x = "hellow"
    val person = "Bob"
    if (x.endsWith("o")) {
      println("Yep")
    } else {
      println("The value os x does not end with o")
    }
    //Two boolean results
    if (person == "Sammy") {
      println("welcome Sammy")
    } else if (person == "George") {
      println("welcome George")
    } else {
      println("What is your name?")
    }
    //AND operator
    println((1 == 2) && (2 == 2))
    //OR operator
    println((1 == 2) || (2 == 2))
    //NOT operator
    println(!(1 == 1))

  }
}