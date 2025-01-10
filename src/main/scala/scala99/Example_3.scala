package scala99
// Find the Kth element of a list.

object Example_3 extends App{

  val list = List(1, 2, 3, 4, 5)
  val list2 = List('a','b','c','d')

  def findKth[A](k: Int, list: List[A]): A = {
    if(k>=0){
      println(s"$k")
      (k, list) match {
        case (0, h :: _   ) => h
        case (n, _ :: tail) => findKth(n - 1, tail)
        case (_, Nil      ) => throw new Exception(s"Invalid index $k")
      }
    } else throw new Exception(s"Invalid index $k")
  }

  println(findKth(3,list))
  println(findKth(0,list2))
 // println(findKth(-1,list))   // throw error as index is negative
 // println(findKth(10,list2))  // throw error as index is greater then length of list


}
