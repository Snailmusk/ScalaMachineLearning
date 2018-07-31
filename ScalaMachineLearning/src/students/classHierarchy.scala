package exercises

object classHierarchy {
  
 abstract class Zoo 
 
 abstract class Zone extends Zoo
 case class BirdCage(name: String) extends Zone
 case class FishCage(name: String) extends Zone
 case class CatCage(name: String) extends Zone
 case class MonkeyCage(name: String) extends Zone
 
 abstract class Section extends Zone
 case class PredatoryBirds() extends Section
 case class SmallBirds() extends Section
 
 case class Sharks() extends Section
 case class Snails() extends Section
 case class SchoolFish() extends Section
 
 
 case class BigCats() extends Section
 case class SmallCats() extends Section
 
 case class BigMonkeys() extends Section
 case class SmallMonkeys() extends Section
 
 abstract class Species extends Section {
   val poisonous = false
   val predatory = false
   val prey = false
   val flying = false
   val swimming = false
   val big = false
   val small = false
   val aggressive = false
 }
 

 }
 
 case class falcon() extends Species {
   override val flying = true
   override val predatory = true
   override val aggresive = true 
 }
 
 case class Eagle() extends Species  {
   override val predatory = true
   override val flying = true
   override val big = true
 }
 case class Hawk() extends Species {
   override val predatory = true
   override val flying = true
   override val aggresive = true
   
 }
 case class Parrot() extends Species {
   override val prey = true
   override val flying = true
   
 }
 case class Budgie() extends Species {
   override val prey = true
   override val flying = true
   override val small = true 
 }
 
 case class GreatWhite() extends Species {
   override val predatory = true
   override val swimming = true
 }
 
 case class Hammer
 case class Falcon() extends Species
 case class Eagle() extends Species
 case class Hawk() extends Species
 
 case class Parrot() extends Species
 case class Budgie() extends Species
 
 case class GreatWhite() extends Species
 case class Hammerhead() extends Species
 case class Goblin() extends Species
 
 case class Cone() extends Species
 case class Garden() extends Species
 case class Burgundy() extends Species
 
 case class Guppie() extends Species
 case class Catfish() extends Species
 
 case class Lion() extends Species
 case class Cheetah() extends Species
 case class Jaguar() extends Species
 
 case class Ocelot() extends Species
 case class Serval() extends Species
 
 case class Gorilla() extends Species
 case class Ape() extends Species
 
 case class Chimpanzee() extends Species
 case class Baboon() extends Species
 
 
 

 
}