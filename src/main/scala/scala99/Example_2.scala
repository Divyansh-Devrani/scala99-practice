package scala99
// Ques: Find the last but one element of a list. (second last)
//   val list = List(1, 2, 3, 4, 5) Output = 4

object Example_2 extends App {
  val list = List(1, 2, 3, 4, 5)
  val list2 = List('a','b','c','d')


  def secondLastElement[A](list:List[A]): A ={
    list match {
      case last :: _ :: Nil => last
      case _ :: tail =>  secondLastElement(tail)
      case _ => throw new Exception("Invalid")
    }
  }

  println(secondLastElement(list))
  println(secondLastElement(list2))
}
