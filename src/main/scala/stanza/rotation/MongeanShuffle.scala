package stanza.rotation

object MongeanShuffle {
  def shuffle[A](list: List[A]) : List[A] = {
    list.zipWithIndex.foldLeft(List.empty[A]){ case (acc, (word, index)) =>
      if (index % 2 == 0) acc :+ word
      else word +: acc
    }
  }
}
