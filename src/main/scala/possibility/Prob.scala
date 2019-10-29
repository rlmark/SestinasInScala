package possibility

trait Prob[T] {
  def toDouble : Double
  def prob(t: T): Prob[T]
  def prob(t: Double): Prob[T] // Think about this...
}