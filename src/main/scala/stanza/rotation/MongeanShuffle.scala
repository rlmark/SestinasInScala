package stanza.rotation

class MongeanShuffle extends NTinaRotation {
  def shuffle[T](list: List[T]) : List[T] = {
    list.zipWithIndex.foldLeft(List.empty[T]){ case (acc, (word, index)) =>
      if (index % 2 == 0) acc :+ word
      else word +: acc
    }
  }

  def shuffleReverse[T](list: List[T]): List[T] = {
    def loop(currentL: List[T], acc: List[T]): List[T] = {
      currentL match {
        case Nil => acc
        case h::tail => loop(tail.reverse,  acc :+ h)
      }
    }
    loop(list, Nil)
  }

  def nextStanza[T](list: List[T]): List[T] = {
    val flippedOriginal = list.reverse
    shuffleReverse(flippedOriginal)
  }
}
