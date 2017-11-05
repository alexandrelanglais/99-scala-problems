import org.scalatest._

class P02Test extends FlatSpec with Matchers {

  it should "be none" in {
    val list = Nil
    P02.lastButOneElement(list) should be(None)
  }

  it should "retrieve no element of a single item list" in {
    val list = List(1)

    P02.lastButOneElement(list) should be(None)
  }
  it should "retrieve last but one element of a multiple item list" in {
    val list = List(1, 2, 3)

    P02.lastButOneElement(list) should be(Some(2))
  }
}
