package stanza.rotation

trait NTinaRotation {
  def nextStanza[A](terminalWords: List[A]): List[A]

  def lastStanza[A](previousStanza: List[A]): List[A] = {
    previousStanza.drop(previousStanza.length / 2).reverse
  }

  def rotate[A](terminalWords: List[A]): List[List[A]] = {
    val standardStanzas = (1 until terminalWords.length).scanLeft(terminalWords)((acc, _) => nextStanza(acc)).toList
    val envoi = lastStanza(standardStanzas.last)
    standardStanzas :+ envoi
  }
}