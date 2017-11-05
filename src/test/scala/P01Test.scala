import collection.mutable.Stack
import org.scalatest._

class P01Test extends FlatSpec with Matchers {

  it should "be none" in {
    val list = Nil
    P01.lastElement(list) should be(None)
  }

  it should "retrieve last element of a single item list" in {
    val list = List(1)

    P01.lastElement(list) should be(Some(1))
  }
  it should "retrieve last element of a multiple item list" in {
    val list = List(1, 2, 3)

    P01.lastElement(list) should be(Some(3))
  }
}
