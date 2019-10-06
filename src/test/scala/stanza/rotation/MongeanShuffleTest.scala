package stanza.rotation

import org.scalatest._

class MongeanShuffleTest extends WordSpec with Matchers {
  val monge = new MongeanShuffle

  "Mongean Shuffle" should {
    "create a valid ordering for list of even length" in {
      val list = List(1,2,3,4,5,6)
      monge.shuffle(list) shouldBe List(6,4,2,1,3,5)
    }
    "create a valid ordering for a list of odd length" in {
      val list = List(1,2,3,4,5)
      monge.shuffle(list) shouldBe List(4,2,1,3,5)
    }
  }

}
