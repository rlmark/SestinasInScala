package poetics.models

case class Line(words: Vector[String], end: TerminalWord) {
  def print: String = (words :+ end.value).mkString(" ")
}
