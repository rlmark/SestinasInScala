package stanza.rotation

class RetrogradatioCruciata extends NTinaRotation {
  def nextStanza[A](list: List[A]): List[A] = {
    val reversedPairs = list.zip(list.reverse).map{ case (a, b) => List(b,  a) }
    reversedPairs.flatten.take(list.length)
  }
}
