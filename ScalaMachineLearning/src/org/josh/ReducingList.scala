package org.josh

object ReducingList {
  def main(args: Array[String]): Unit = {
    //Scala has high-performance, object-oriented, and type-parameterized collections framework like Java.
    //Also has higher-order operations like map, filter, and reduce.
    //List is immutible singly linked list.
    val numbers = List(24, 2, 2)
    println(numbers.size)
    println(numbers.head)
    println(numbers.tail)

    val colors = List("red", "green", "blue")
    println(s"I have ${colors.size} colors: $colors")

    //List range method
    val x = List.range(1, 10)
    val y = List.range(0, 10, 2)
    //= List(1, 3, 5, 7, 9)

    //List fill method
    val z = List.fill(3)("foo")
    //= List(foo, foo, foo)

    import scala.collection.mutable.ListBuffer
    var fruits = new ListBuffer[String]()
    fruits += "Apple"
    fruits += "Banana"
    fruits += "Orange"
    val fruitsList = fruits.toList
    println(fruitsList)

    //List for-loop
    var total = 0
    for (i <- numbers) { total += i; println(total) }

    //___________________________________________________

    //Set is immutable and unordered collection of unique elements.
    //Sets are iterables that contain no duplicate elements.
    val unique = Set(10, 20, 30, 20, 20, 10)
    var all = 0; for (i <- unique) { all += i; println(all) }
    println(unique(1000))

    //___________________________________________________

    //Scala support mathematical reduction, Boolean reduction, and generic higher-order operations.
    //All list reductions use logic to reduce a list down to a single value.
    //3 folding operations: fold, reduce, and scan.
    //fold - List(4,5,6).fold(0)(_+_)
    //foldLeft - List(4,5,6).foldLeft(0)(_+_)
    //FoldRight - List(4,5,6).foldRight(0)(_+_)
    
    val fold = numbers.fold(0)((x, y) => x + y)
    val foldLeft = numbers.foldLeft(0)((x, y) => x / y)
    println(fold)

    val reduce = numbers.reduce(_ + _)
    val reduceLeft = numbers.reduceLeft(_/_)
    println(reduceLeft)

    val scan = numbers.scan(1)(_+_)
    println(scan)
    
    //divide function
    
    val divide = (x: Double, y: Double) => {
      x / y
    
    }
    val doubList = List(6.9, 133.7, 42.0)
    println(doubList.reduceRight((x,y) => divide(x,y)))
    
    
    
   
  }

}