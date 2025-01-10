package scala99
// Eliminate consecutive duplicates of list elements.
object Example_8 extends App {
  val list = List(1,2,2,2,5,2,7,3,3,8,9,1,1,5,9,9,4,9)
  val list2 = List('a','w','1','1','s','7','s','q','q','a')
  val list3 = List(1,1,2,2,5,6,7,2,5,1,8,9)
val listRev = List()

  def remove[A](list: List[A], removedList:List[A]): List[A] = {
    list match {
      case Nil => removedList.reverse
      case head :: Nil => (head :: removedList).reverse
      case head :: tail if tail.head == head => remove(tail, removedList)
      case head :: tail => remove(tail, head :: removedList)
    }
  }
  println(remove(list,listRev))
  println(remove(list2,listRev))
  println(remove(list3,listRev))
}
