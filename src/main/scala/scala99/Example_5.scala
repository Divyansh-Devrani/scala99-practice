package scala99

// Reverse a list.
object Example_5 extends App{
  val list = List(1, 2, 3, 4, 5)
  val list2 = List('a','b','c','d')
  val list3 = Nil

  def reverseList[A](list:List[A]): List[A] = {
    def reverseHelper[A](list:List[A],reverselist:List[A]=List()): List[A] = {
      list match {
        case h :: tail => reverseHelper(tail,h::reverselist)
        case _ => reverselist
      }
    }
    reverseHelper(list)
  }

  println(reverseList(list))
  println(reverseList(list2))
  println(reverseList(list3))

}
