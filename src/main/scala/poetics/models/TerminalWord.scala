package poetics.models


sealed trait TerminalWord {
  val value: String
}

case class A(value: String) extends TerminalWord
case class B(value: String) extends TerminalWord
case class C(value: String) extends TerminalWord
case class D(value: String) extends TerminalWord
case class E(value: String) extends TerminalWord
case class F(value: String) extends TerminalWord