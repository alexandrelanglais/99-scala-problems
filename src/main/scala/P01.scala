import scala.annotation.tailrec

object P01 {
  @tailrec
  def lastElement[T](l: List[T]): Option[T] = l match {
    case h :: Nil => Some(h)
    case x :: xs => lastElement(xs)
    case Nil => None
  }
}