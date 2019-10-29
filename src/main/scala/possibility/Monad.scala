package possibility

trait Monad[M[_]]{
  def pure[A](a: A): M[A]
  def flatMap[A, B](fa: M[A])(f: A => M[B]): M[B]
}

object Monad {
  def apply[M[_]](implicit m: Monad[M]): Monad[M] = m
}
