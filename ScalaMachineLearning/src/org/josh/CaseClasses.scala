package org.josh

object CaseClasses {
  /*Case classes are like regular classes with differences like modeling immutable
  data.
  *Case classes are compared by structure and not by reference.
  */
case class Book(isbn: String)
val frankenstein = Book("947-295105204190")

case class Message(sender: String, recipient: String, body: String)
val message1 = Message("Snailmusk@gmail.com", "joshua.kim.snailman@gmail.com", "Go eat a bag of ducks.")

case class MessageN(sender: String, recipient: String, body: String)
val message2 = Message("Snailmusk@gmail.com", "joshua.kim.snailman@gmail.com", "Go eat a bag of ducks.")
val message3 = Message("Snailmusk@gmail.com", "joshua.kim.snailman@gmail.com", "Go eat a bag of ducks.")
val messagesAreSame = message2 == message3

case class MessageNN(sender: String, recipient: String, body: String)
val message4 = Message("Snailmusk@gmail.com", "joshua.kim.snailman@gmail.com", " Go eat a bag of ducks.")
val message5 = message4.copy(sender = message4.recipient, recipient = " briannakim3@gmail.com")
val message6 = message4.copy()
   def main(args: Array[String]): Unit = {
  println(frankenstein.isbn)
  println(message1.recipient)
  println(message1.body)
  println(messagesAreSame)
  println(message5)
   }
}