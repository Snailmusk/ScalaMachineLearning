package exercises

object classHierarchy {
  
 abstract class Zoo 
 
 abstract class Zone extends Zoo
 case class BirdCage(name: String) extends Zone
 case class FishCage(name: String) extends Zone
 case class HoovedCage(name: String) extends Zone
 case class CatCage(name: String) extends Zone
 case class MonkeyCage(name: String) extends Zone
 
 abstract class Section extends Zone
 case class PredatoryBirds() extends Section
 case class SmallBirds() extends Section
 
 case class Sharks() extends Section
 case class Snails() extends Section
 case class SchoolFish() extends Section
 
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
 
 case class ConeSnail() extends Species {
   override val poisonous = true
 }
 
 case class Horse() extends Species {
   override val big = true
   override val prey = true
 }
 
 case class Falcon() extends Species
 case class Eagle() extends Species
 case class Hawk() extends Species
 
 case class GreatWhite() extends Species
 case class Hammerhead() extends Species
 case class Goblin() extends Species
 
 
}