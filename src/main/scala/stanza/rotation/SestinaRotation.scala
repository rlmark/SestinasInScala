package stanza.rotation

import poetics.models.TerminalWord

class SestinaRotation {
  def nextStanza(ws: List[TerminalWord]): List[TerminalWord] = {
    // TODO: error handling
    val a :: b :: c :: d :: e :: f :: Nil = ws
    f :: a :: e :: b :: d :: c :: Nil
  }
  def lastStanza(ws: List[TerminalWord]): List[TerminalWord] = {
    ws.drop(3).reverse
  }

  def rotate(ws: List[TerminalWord]): List[List[TerminalWord]] = {
    val standardStanzas = (1 to 5).scanLeft(ws)((acc, _) => nextStanza(acc)).toList
    val envoi = lastStanza(standardStanzas.last)
    standardStanzas :+ envoi
  }
}
