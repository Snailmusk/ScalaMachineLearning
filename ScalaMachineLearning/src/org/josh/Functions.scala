package org.josh

object Functions {
  /* Difference between functions and methods.
   * Function describes the idea of having a piece of code that 
   * can take in parameters, perform an operation, and produce
   * output.
   */
	def simple(): Unit = {
			println("simple print")
	}
	
	def adder(num1:Int, num2:Int): Int = {
	  return num1 + num2
	}
	
	def greetName(name:String): String = {
	  return s"Hello $name"
	}
	
	def isPrime(numcheck:Int): Boolean = {
	  for(n <- Range(2, numcheck)) {
	    if(numcheck%n == 0) {
	      return false
	    }
	  }
	  return true
	}
	
	val numbers = List(1, 2, 3, 7)
	
	def check(nums:List[Int]): List[Int] = {
	  return nums
	}
	
  def main(args: Array[String]): Unit = {
    simple()
    println(adder(4, 5))
    println(greetName("tommy"))
    println(isPrime(10))
    println(isPrime(23))
    println(check(numbers))
  }
}