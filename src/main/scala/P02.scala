import scala.annotation.tailrec

object P02 {
  @tailrec
  def lastButOneElement[T](l: List[T]): Option[T] = l match {
    case h :: x :: Nil => Some(h)
    case x :: xs :: xss => lastButOneElement(xs :: xss)
    case Nil => None
    case x :: Nil => None
  }

}
