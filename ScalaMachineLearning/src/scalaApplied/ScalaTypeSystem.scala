package scalaApplied

object ScalaTypeSystem {
  /*
  trait Food { val name: String }
  trait Fruit extends Food
  trait Cereal extends Food

  case class Apple(name: String) extends Fruit
  case class Orange(name: String) extends Fruit
  case class Muesli(name: String) extends Cereal

  case class FoodBowl[+F <: Food](food: F) {
    def eat: String = s"Yummu ${food.name}"
  }

  def main(args: Array[String]): Unit = {
    val fiji = Apple("fiji")
    val jaffa = Orange("jaffa")
    val alpen = Muesli("alpen")
    //Type parameter becomes part of the overall Type; list of Int != list of Strings
*/
  abstract class Food { val name: String }

  abstract class Fruit extends Food

  case class Banana(name: String) extends Fruit
  case class Apple(name: String) extends Fruit

  abstract class Cereal extends Food
  case class Granola(name: String) extends Cereal
  case class Muesli(name: String) extends Cereal

  case class Bowl(food: Food) {
    override def toString = s"A bowl of yummy ${food.name}s"
    def contents = food
  }
  
  //GENERIC
  case class Bowl2[J <: Food](contents: J) {
    //<: is an upper bound, points along the hierarchy
    //type F, parameters will be F
    override def toString: String = s"A yummy bowl of ${contents.name}s"
    //...yummy bowl of ${contents.name}s" won't work, not member of type parameter due to generic definition
  }

  def eat(f: Food): String = s"${f.name} eaten"
  
  val fuji = Apple("Fuji")
  val alpen = Muesli("Alpen")
  
  val appleBowl = Bowl2(fuji)
  val muesliBowl = Bowl2(alpen)
  
  //val numBowl = Bowl2(10)
  //due to type parameterization of J being associated with Food, it can't be done
  def main(args: Array[String]): Unit = {

    println(eat(fuji))
    println(Bowl(fuji))
    
    println(Bowl2(fuji))
  
  }

}