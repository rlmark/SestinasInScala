package stanza.rotation

import org.scalatest._
import poetics.models._

class SestinaRotationSpec extends WordSpec with Matchers {
  "SestinaRotation" should {
    val a = A("a")
    val b = B("b")
    val c = C("c")
    val d = D("d")
    val e = E("e")
    val f = F("f")

    val firstStanza = List(a, b, c, d, e, f)
    val secondStanza = List(f, a, e, b, d, c)
    val thirdStanza = List(c, f, d, a, b, e)
    val fourthStanza = List(e, c, b, f, a, d)
    val fifthStanza = List(d, e, a, c, f, b)
    val sixthStanza = List(b, d, f, e, c, a)
    val envoi = List(a, c, e)

    val sestinaRotation = new SestinaRotation
    "rotate a list of words for a sestina" when {
      "standard stanza transition" in {
        sestinaRotation.nextStanza(firstStanza) should contain theSameElementsInOrderAs secondStanza
      }
      "lastStanza transition" in {
        sestinaRotation.lastStanza(sixthStanza) should contain theSameElementsInOrderAs envoi
      }
      "write full seven stanzas" in {
        sestinaRotation.rotate(firstStanza) should contain theSameElementsInOrderAs List(
          firstStanza,
          secondStanza,
          thirdStanza,
          fourthStanza,
          fifthStanza,
          sixthStanza,
          envoi
        )
      }
    }
  }
}
