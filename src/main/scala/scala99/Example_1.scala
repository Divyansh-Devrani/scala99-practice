package scala99
// Ques: Find the last element of a list.
//  List(1, 1, 2, 3, 5, 8)  output = 8

object Example_1 extends App {
  val list = List(1, 2, 3, 4, 5)
  val list2 = List('a','b','c','d')


  def lastElement[A](list:List[A]): A ={
    list match {
      case last :: Nil => last
      case _ :: tail =>  lastElement(tail)
      case _ => throw new Exception("Invalid")
    }
  }

  println(lastElement(list))
  println(lastElement(list2))

}
