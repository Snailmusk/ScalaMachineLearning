package org.josh

object OOPS {
  /* Classes are the core building block of OO languages,
   * a combination of data structures with functions ("methods").
   * Class is defined with values and variables and can be
   * instantiated as many times as needed, each one initialized
   * with its own input data.
   */

  class User(val name: String) {
    def greet { println(s"Hello from $name") }
    override def toString = s"User($name)"
  }


  def main(args: Array[String]): Unit = {
   //val u = new User("J A M E S")
   //u.greet
    
    val userList = List(new User("Shoto"), new User("Art3mis"),
    		new User("Aesch"))
    
    val size = userList.map(_.name.size)
    val sorted = userList.sortBy(_.name)
    val three = userList.find(_.name contains ("3"))
    println(size)
    println(sorted)
    println(three)
  }
}