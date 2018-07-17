package org.josh

object Maps {
  /*In set theory, and mathematics in general, to map
  is to create an association between each element in
  in another set. Scala has map methods that take a function
  and apply it to every member of a list, collecting new results
  in list.
  */
  def main(args: Array[String]): Unit = {
    val x = List(1, 2, 3, 4, 5)
    println(x.map(a => a * a))
    println(x.map(a => a + 100))

    for (a <- 1 until 10) {
      print(a * a + ", ");
    }

    //flatMap method acts as shorthand to map a collection and then
    //immediately flatten it. flatMap = map + flatten

    val fruits = Seq("apple", "banana", "orange")
    println(fruits.map(x => x.toUpperCase))
    println(fruits.flatMap(x => x.toUpperCase))
    //println(fruits.map(x => x.toUpperCase)).flatten [alternative]

    
    def toInt(s: String): Option[Int] = {

      try {
        Some(Integer.parseInt(s.trim))
      } catch {
        // catch Exception to catch null 's'
        case e: Exception => None
      }
    }

    val String = List("1", "2", "three", "4")
    val mapResult = String.flatMap(toInt)
    val flatMapResult = String.flatMap(toInt)
    println(flatMapResult)
    println(mapResult)
    
    //more maps
    def g(v:Int) = List(v-1, v, v+1)
    println(g(3))
    
    val list = List(1, 2, 3)
    println(list.map(x => g(x)))
    println(list.flatMap(x => g(x)))
  }
  

}