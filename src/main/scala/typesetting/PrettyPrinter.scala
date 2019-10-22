package typesetting

import poetics.models._

trait PrettyPrinter[A] {
  def print(a: => A): String
}

object PrettyPrinter {
  def apply[A](implicit a: PrettyPrinter[A]): PrettyPrinter[A] = a
}

object PrettyPrinterImpl {

  implicit class PrettyPrinterSyntax[A: PrettyPrinter](a: A) {
    def print: String = PrettyPrinter[A].print(a)
  }

  implicit val linePrinter: PrettyPrinter[Line] = new PrettyPrinter[Line] {
    override def print(a: => Line): String = (a.words :+ a.end.value).mkString(" ")
  }

  implicit def stanzaPrinter(implicit pp: PrettyPrinter[Line]): PrettyPrinter[Stanza] = new PrettyPrinter[Stanza] {
    override def print(a: => Stanza): String = a match {
      case Sestet(l1, l2, l3, l4, l5, l6) => List(pp.print(l1), pp.print(l2), pp.print(l3), pp.print(l4), pp.print(l5), pp.print(l6))
        .mkString("\n") + "\n"
      case Envoi(l1, l2, l3) => List(pp.print(l1), pp.print(l2), pp.print(l3)).mkString("\n")
    }
  }
}
