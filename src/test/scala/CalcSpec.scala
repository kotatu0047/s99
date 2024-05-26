import org.scalatest.*
import org.scalatest.concurrent.TimeLimits
import org.scalatest.concurrent.TimeLimits.*
import org.scalatest.time.{Millis, Span}
import org.mockito.Mockito._
import flatspec.*
import matchers.*

class CalcSpec extends AnyFlatSpec with should.Matchers {
  val calc = new Calc

  "isPrime" should "その値が素数であるかどうかのブール値を返す" in {
    assert(calc.isPrime(0) === false)
    assert(calc.isPrime(-1) === false)
    assert(calc.isPrime(2) === true)
    assert(calc.isPrime(17) === true)
    assert(calc.isPrime(18) === false)
  }

  it should "100万以下の値の素数判定を一秒以内で処理できる" in {
    failAfter(Span(1000, Millis)) {
      assert(calc.isPrime(9999991))
    }
  }

  "Calcのモックオブジェクト" should "振る舞いを偽装することができる" in {
    val mockCalc = mock(classOf[Calc])
    when(mockCalc.isPrime(2)).thenReturn(false)
    assert(mockCalc.isPrime(2) === false)
  }
}
