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
    def height: Int = contents.length
    def width: Int = if (height == 0) 0 else
      contents.map(_.size).max
    def example: Int = 42
    final def example2: Int = 42
    //final cannot be changed, overriden, subclass or extend down the hierarchy.

    def above(that: Element): Element =
      new ArrayElement(this.contents ++ that.contents)

    def beside(that: Element): Element =
      new ArrayElement(
        for (
          (line1, line2) <- this.contents zip that.contents
        ) yield line1 + line2)
    
    override def toString = contents mkString "\n"
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

  class LineElement(s: String) extends ArrayElement(Array(s)) {
    //LineElement is subclass of Element
    //val can override def in subclass, but not in superclass
    override def width = s.length
    override val height = 1
    override def example: Int = 1
    //override... overrides.
  }
  
  class UniformElement(
      ch: Char,
      override val width: Int,
      override val height: Int
      ) extends Element
      {private val line = ch.toString * width
      val contents = Array.fill(height)(line)
      }
  
  def main(args: Array[String]): Unit = {

    new ArrayElement(Array("hi"))

    val ae = new ArrayElement(Array("hi", "planet"))
    val le = new LineElement("Burp")
    println(ae.height)
    println(ae.width)
    println(ae.contents)
    println(ae.example)
    println(le.example)
    println(ae.above(le))
    println(ae.beside(le))
    

  }
}