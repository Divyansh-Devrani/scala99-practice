package scala99

//  Find out whether a list is a palindrome.
object Example_6 extends App{
  val list = List(1, 2, 3, 4, 5)
  val list2 = List('a','b','c','d')
  val list3 = Nil
  val list4 = List('a','b','b','a')
  val list5 = List(1,2,3,2,1)

  def palindrome[A](list:List[A]): Boolean = {
    val rev = list.reverse
    def palindromeHelper[A](list:List[A], rev: List[A]):Boolean ={
      if(list.isEmpty){
        true
      } else {
        if(list.head == rev.head)
          palindromeHelper(list.tail,rev.tail) else false
        }
      }
    palindromeHelper(list,rev)
  }

  println(palindrome(list))
  println(palindrome(list2))
  println(palindrome(list3))
  println(palindrome(list4))
  println(palindrome(list5))
}
