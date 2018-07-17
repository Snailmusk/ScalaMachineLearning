package org.joshExercises

object CanYouBalance {
  def main(args: Array[String]): Unit = {
    var store = 0
    val x = List(1, 3, 5, 7, 7, 12)

    for (y <- x) {
      if (y == 7) {
        store = store + 14
        println(store)
      } else {
        store = store + y
        println(store)
      }

    }

  }
}