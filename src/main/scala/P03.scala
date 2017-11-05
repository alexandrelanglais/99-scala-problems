import scala.annotation.tailrec

object P03 {
  def nthElement[T](index: Int, l: List[T]): Option[T] = {
    @tailrec
    def nth(curIndex: Int, list: List[T]): Option[T] = {
      if (curIndex == 0)
        list match {
          case x :: _  => Some(x)
          case Nil      => None
        } else if (list.drop(1) == Nil) None
      else nth(curIndex - 1, list.drop(1))
    }
    nth(index, l)
  }

}
