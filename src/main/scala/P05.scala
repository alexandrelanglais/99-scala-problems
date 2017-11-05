import scala.annotation.tailrec

object P05 {
  def reverse[T](l: List[T]): List[T] = {

    def rev(list: List[T]): List[T] = {
      list match {
        case Nil => Nil
        case x :: Nil => x :: Nil
        case x :: xs => rev(xs) ::: List[T](x)
      }
    }
    rev(l)
  }

}
