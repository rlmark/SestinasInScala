package poetics.models


sealed trait Stanza

case class Sestet(l1: Line,
                  l2: Line,
                  l3: Line,
                  l4: Line,
                  l5: Line,
                  l6: Line) extends Stanza

case class Envoi(l1: Line,
                 l2: Line,
                 l3: Line) extends Stanza
