import scala.annotation.tailrec

object S99_1 {
  private def last[A](list: List[A]): A = list.last

  @tailrec
  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, World!")
  }
}
