package basicconcepts

object folds extends App {
  //fold
  val numbers = List(2, 2, 20)
  var fold = numbers.fold(0)(_+_)
  println(fold)
  //reduce
  var reduce = numbers.reduceLeft(_/_)
  println(reduce)
  //scan
  var scan = numbers.scan(0)(_+_)
  print(scan)
  
}