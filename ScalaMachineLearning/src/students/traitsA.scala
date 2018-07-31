package exercises

object traits extends App {
  //defining a trait
  trait Philosophical {
    def philosophize(): Unit = {
      println("I consume memory, therefore I am.")
    }
    class Animal 
    
    class Frog wxtends Animal with Philosophical {
      override def tostring = "green"

    }
    trait Haslegs
    class Frog extends Animal with Philosphical with Haslegs {
      //overriding methods/fields from traits 
    }
    override def philosophize(): Unit = {
      println(s"It ain't easy being $this!")
    }
    
    
    
    
    val phrog: Philosophical = new Frog
    phrog.philosophize() 
       
  }
  //differences between traits and classes
 //traits can have fields and state, but not constructor params
  class Point(x: Int, y: Int) // fine
  trait NOPoint(x: Int, y: Int) // does not compile
  //Classes resolve calls to super at point class is defines
  //Traits resolve calls to super at point trait is used
  
}

