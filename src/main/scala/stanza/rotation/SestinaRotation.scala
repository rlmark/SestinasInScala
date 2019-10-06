package stanza.rotation

class SestinaRotation extends NTinaRotation {
  def nextStanza[A](ws: List[A]): List[A] = {
    require(ws.length == 6, "A sestina must have six terminal words!")
    val a :: b :: c :: d :: e :: f :: Nil = ws
    f :: a :: e :: b :: d :: c :: Nil
  }
}
