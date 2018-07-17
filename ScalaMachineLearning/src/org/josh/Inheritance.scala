package org.josh

object Inheritance {
  class A {
    def hi = "Hello from A"
  }
  def main(args: Array[String]): Unit = {
    class B extends A
    class C extends B { override def hi = super.hi }
    class D extends C {override def hi = "Hello from D" }
    
    val hiA = new A().hi
    val hiB = new B().hi
    val hiC = new C().hi
    val hiD = new D().hi
    println(hiA + hiB + hiC + hiD)
    
  }
}