package scala99
//Pack consecutive duplicates of list elements into sublists.
object Example_9 extends  App {
  val list = List(1,2,2,2,5,2,7,3,3,8,9,1,1,5,9,9,4,9)
  val list2 = List('a','w','1','1','s','7','s','q','q','a')
  val list3 = List(1,1,2,2,5,6,7,2,5,1,8,9)
/*
  def sublist[A](list: List[A], newList:List[A]=List()): List[Any] = {
    list match {
      case Nil => newList.reverse
      case head :: Nil => (head :: newList).reverse
      case head :: tail if tail.head == head => sublist(tail, newList)
      case head :: tail => sublist(tail, head :: newList)
    }
  }
  println(sublist(list))
  println(sublist(list2))
  println(sublist(list3))*/

  def pack[A](ls: List[A]): List[List[A]] = {
    if (ls.isEmpty) List(List())
    else {
      val (packed, next) = ls span { _ == ls.head }
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }
  println(pack(list))
  println(pack(list2))
  println(pack(list3))
}
