package stanza.rotation

import org.scalatest._
import poetics.models._

trait NTinaRotationTestHarness[T <: NTinaRotation] extends WordSpec with Matchers {
  val rotationImpl: T

  "Sestina Rotation" should {
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

    "rotate a list of words for a sestina" when {
      "standard stanza transition" in {
        rotationImpl.nextStanza(firstStanza) should contain theSameElementsInOrderAs secondStanza
      }
      "lastStanza transition" in {
        rotationImpl.lastStanza(sixthStanza) should contain theSameElementsInOrderAs envoi
      }
      "write full seven stanzas" in {
        rotationImpl.rotate(firstStanza) should contain theSameElementsInOrderAs List(
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
