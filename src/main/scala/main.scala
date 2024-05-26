class Calc {
  def isPrime(n: Int): Boolean = {
    if (n < 2) {
      return false
    } else {
      !((2 to Math.sqrt(n).toInt) exists (n % _ == 0))
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, World!")
    val calc = new Calc
    println(calc.isPrime(4))
    println(calc.isPrime(5))
    println(calc.isPrime(61))
    println(calc.isPrime(63))
  }
}
