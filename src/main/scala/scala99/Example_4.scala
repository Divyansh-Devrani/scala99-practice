package scala99

//  Find the number of elements of a list.
object Example_4 extends App{

  val list = List(1, 2, 3, 4, 5)
  val list2 = List('a','b','c','d')
  val list3 = Nil

  def findLength[A](list:List[A],length:Int = 0): Int ={
    list match {
      case _ :: Nil => length + 1
      case _ :: tail =>  findLength(tail,length+1)
      case _ => length
    }
  }

  println(findLength(list))
  println(findLength(list2))
  println(findLength(list3))

}
