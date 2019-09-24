package stanza.rotation

import org.scalatest._
import poetics.models._

class SestinaRotationSpec extends WordSpec with Matchers {
  def withMocks(f: SestinaRotation => Unit): Unit = {
    val s = new SestinaRotation
    f(s)
  }

  "SestinaRotation" should {
    "rotate a list of words for a sestina" in withMocks { sestinaRotation =>
      val firstStanza = List(A("a"), B("b"), C("c"), D("d"), E("e"), F("f"))
      sestinaRotation.nextStanza(firstStanza) should contain theSameElementsInOrderAs List(???)
    }
  }
}
