import scala.annotation.tailrec

object P02 {
  @tailrec
  def lastButOneElement[T](l: List[T]): Option[T] = l match {
    case Nil => None
    case _ :: Nil => None
    case h :: _ :: Nil => Some(h)
    case _ :: xs :: xss => lastButOneElement(xs :: xss)
  }

}
