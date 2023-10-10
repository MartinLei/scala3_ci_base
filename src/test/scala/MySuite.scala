import org.scalatest.funsuite.AnyFunSuite

class MySuite extends AnyFunSuite:
  test("example test that succeeds") {
    val obtained = 42
    val expected = 43
    assert(obtained == expected)
  }
