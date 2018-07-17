package org.josh

object Collection {
  def main(args: Array[String]): Unit = {

    val l = List(3, 2, 5, 4)

    //mathematical reduction operations
    //max - List(41, 59, 26).max
    //min - List(10.9, 32.5, 4.23).min
    //product - List(5, 6, 7).product
    //sum - List(11.3, 23.5, 7.2).sum

    println(l.max)
    println(l.min)
    println(l.product)
    println(l.sum)

    //boolean reduction operations
    //contains - List(34, 29, 18) contains 29
    //endsWith - List(0, 4, 3) endsWith List(4, 3)
    //exists - List(24, 17, 32) exists (_ < 18)
    println(l.contains(4))
    println(l.startsWith(List(3)))
    println(l.endsWith(List(5,4)))
    println(l.exists(x => x<3))
    println(l.forall(x => x<8))
  }
}