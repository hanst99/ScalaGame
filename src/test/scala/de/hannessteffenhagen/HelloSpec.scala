package de.hannessteffenhagen

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FlatSpec}

@RunWith(classOf[JUnitRunner])
class HelloSpec extends FlatSpec with Matchers {
  behavior of "A Hello World"
  it should "be trivial" in {
    true shouldBe true
  }
  it should "provide an example for a failing test" in pendingUntilFixed {
    true shouldBe true
  }
}
