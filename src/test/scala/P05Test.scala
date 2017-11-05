import org.scalatest._

class P05Test extends FlatSpec with Matchers {

  "A nil list" should "be nil" in {
    val list = Nil
    P05.reverse(list) should be(Nil)
  }

  "An empty list" should "be List()" in {
    val list = List()

    P05.reverse(list) should be(List())
  }
  "A 3 elements list" should "be reversed" in {
    val list = List(1, 2, 3)
    val expected = List(3, 2, 1)
    P05.reverse(list) should be(expected)
  }
  "A one element list" should "be the same" in {
    val list = List(1)

    P05.reverse(list) should be(list)
  }
}
