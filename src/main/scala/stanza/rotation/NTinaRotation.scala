package stanza.rotation

class NTinaRotation {

  def nextStanza[A](list: List[A]) = {
    // 1.) Take your list and perform a Mongean shuffle
    val originalList = list
    val shuffledList = MongeanShuffle.shuffle(list)

    println(s"original list: ${originalList.mkString(", ")}")
    println(s"shuffled List: ${shuffledList.mkString(", ")}")
    // 2. Flip it left to right
    val flippedOriginal = originalList.reverse
    val flippedShuffled = shuffledList.reverse

    println(s"reversed original: ${flippedOriginal.mkString(", ")}")
    println(s"reversed shuffled: ${flippedShuffled.mkString(", ")}")
    // 3. Flip these two vertically, so the next and original swap places
    val swappedOriginal = flippedShuffled
    val swappedNext = flippedOriginal

    println(s"new first stanza: ${swappedOriginal.mkString(", ")}")
    println(s"new second stanza: ${swappedNext.mkString(", ")}")

  }

}

object Test extends App {

  val nTina = new NTinaRotation()
  nTina.nextStanza(List(1,2,3,4,5,6))
}
