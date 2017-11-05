import scala.annotation.tailrec

object P04 {
  def nbElement[T](l: List[T]): Int = {
    @tailrec
    def nb(n: Int, list: List[T]): Int = {
      list match {
        case Nil => 0
        case _ :: Nil => 1 + n
        case _ :: xs => nb(n + 1, xs)
      }
    }
    nb(0, l)
  }

}
