package exercises

object trainHierarchy {
  
	abstract class RollingStock {val name: String } 
	
	abstract class Car (carries = String) extends RollingStock 
	Passenger Car (carries: People) extends Car
	Cargo Car (carries: Cargo) extends Car
	
	abstract class Engine (MaxCars = Int) extends RollingStock
	Cars: mutable.ListBuffer[Car]
	
	SteamEngine (MaxCars = 3) extends Engine
	DieselEngine (MaxCars = 6) extends Engine 
	
}