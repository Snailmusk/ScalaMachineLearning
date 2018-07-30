package scalaApplied

object ScalaTypeSystem {
  /*FoodBowl[Apple] to be a sub-type of FoodBowl[Fruit] AND FoodBowl[Food]
   * Relationship is known as variance and demarked by + and - on the generics
   * +J means co-variant, -L means contra-variant, applied to generic class or trait
   * if, neither means invariant.
   * Invariant means no relation
   * Covariant is typical variant order
   * Contravariant is reverse direction hierarchy
   * (Subtype/Supertype)
   */
  abstract class Food { val name: String }

  abstract class Fruit extends Food

  case class Banana(name: String) extends Fruit
  case class Apple(name: String) extends Fruit

  abstract class Cereal extends Food
  case class Granola(name: String) extends Cereal
  case class Muesli(name: String) extends Cereal

  abstract class Animal {
    val name: String
    override def toString: String = s"Animal - $name"
  }

  case class Dog(name: String) extends Animal

  case class Bowl(food: Food) {
    override def toString = s"A bowl of yummy ${food.name}s"
    def contents = food
  }

  //GENERIC
  case class FoodBowl[+J <: Food](contents: J) {
    //<: is an upper bound, points along the hierarchy
    //type F, parameters will be F
    //+ is allowing covariance
    override def toString: String = s"A yummy bowl of ${contents.name}s"
    //...yummy bowl of ${contents.name}s" won't work, not member of type parameter due to generic definition
  }

  def eat(f: Food): String = s"${f.name} eaten"

  def serveToFruitEater(fruitBowl: FoodBowl[Fruit]) =
    s"Mmm, those ${fruitBowl.contents.name}s were very good"

  def serveToFoodEater(foodBowl: FoodBowl[Food]) =
    s"Mmm, those ${foodBowl.contents.name}s were very good"

  val fuji = Apple("Fuji")
  val alpen = Muesli("Alpen")

  val appleBowl = FoodBowl(fuji)
  val muesliBowl = FoodBowl(alpen)

  //val numBowl = FoodBowl(10)
  //due to type parameterization of J being associated with Food, it can't be done

  val dottie = Dog("Dottie")
  //val dogFoodBowl = Bowl(dottie) doesn't work, dottie isn't food

  val fruitBowl = FoodBowl[Fruit](fuji)
  val cerealBowl = FoodBowl[Cereal](alpen)
  //type parameter is specified, Fruit. If remove, it would become a subtype Apple
  def main(args: Array[String]): Unit = {

    println(eat(fuji))
    println(Bowl(fuji))
    println(FoodBowl(fuji))
    println(serveToFruitEater(fruitBowl))
    //println(serveToFruitEater(cerealBowl)) doesn't work, as cereal is not fruit
    println(serveToFoodEater(FoodBowl[Cereal](alpen)))
  }

}