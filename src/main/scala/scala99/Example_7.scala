package scala99
// Flatten a nested list structure.
// flatten(List(List(1, 1), 2, List(3, List(5, 8))))
//res0: List[Any] = List(1, 1, 2, 3, 5, 8)
object Example_7 extends App{
val list = List(List(1, 1), 2, List(3, List(5, 8)))

  def flattern(list: List[Any]):List[Any] = {
     list.flatMap {
       case l: List[_] => flattern(l)
       case e => List(e)}
  }
  println(flattern(list))
}
