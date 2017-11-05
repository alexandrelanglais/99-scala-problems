import org.scalatest._

class P03Test extends FlatSpec with Matchers {

  it should "be none" in {
    val list = Nil
    P03.nthElement(2, list) should be(None)
  }

  it should "retrieve no element of a single item list" in {
    val list = List(1)

    P03.nthElement(1, list) should be(None)
  }
  it should "retrieve element at position n" in {
    val list = List(1, 2, 3)

    P03.nthElement(2, list) should be(Some(3))
  }
  it should "retrieve element at position 0" in {
    val list = List(1, 2, 3)

    P03.nthElement(0, list) should be(Some(1))
  }
}
