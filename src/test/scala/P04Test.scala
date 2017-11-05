import org.scalatest._

class P04Test extends FlatSpec with Matchers {

  it should "be zero" in {
    val list = Nil
    P04.nbElement(list) should be(0)
  }

  it should "be 0" in {
    val list = List()

    P04.nbElement(list) should be(0)
  }
  it should "be 3" in {
    val list = List(1, 2, 3)

    P04.nbElement(list) should be(3)
  }
  it should "be 1" in {
    val list = List(1)

    P04.nbElement(list) should be(1)
  }
}
