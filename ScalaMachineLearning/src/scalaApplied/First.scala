package scalaApplied

object First {
  //  elem(s: String): Element
  //
  //  val column1 = elem("hello") above elem("***")
  //  val column2 = elem("***") above elem("world")
  //  column1 beside column2

  // HIERARCHY: Array[String] -- ArrayElement --> Element <<abstract>> --> scala AnyRef <<java.lang.Object>>
  abstract class Element extends AnyRef {
    def contents: Array[String]
    val height: Int = contents.length
    val width: Int = if (height == 0) 0 else
      contents.map(_.size).max
  }
  /*Can call empty-paren methods with or without parens
   * Can only call parameterless methods without parens
   * (Recommended) Use parents if side effects
   */
  class ArrayElement(conts: Array[String]) extends Element {
    def contents: Array[String] = conts
    //val contents: Array[String] = conts
    //can't have field and method with same name
  }

  def main(args: Array[String]): Unit = {

    new ArrayElement(Array("hi"))
    
    val ae = new ArrayElement(Array("hi", "planet"))
    println(ae.height)
    println(ae.width)
    println(ae.contents)

  }
}