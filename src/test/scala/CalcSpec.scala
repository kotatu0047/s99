import S99_1.lastRecursive
import org.scalatest.*
import flatspec.*
import matchers.*

class CalcSpec extends AnyFlatSpec with should.Matchers {
  it should "s99_1" in {
//    assert(last(List(1, 1, 2, 3, 5, 8)) === 8)
    assert(lastRecursive(List(1)) === 1)
    assert(lastRecursive(List(1, 3, 2)) === 2)
    assert(lastRecursive(List(1, 3, 2, 4, 3, 6)) === 6)
    assert(lastRecursive(List(1.3, 3, 2, 4, 3, 6)) === 6)
    intercept[NoSuchElementException] {
      lastRecursive(List())
    }
  }
}
