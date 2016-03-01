package jp.qilab

import org.scalatest.{FunSpec, Matchers}

class DepCheckSpec extends FunSpec with Matchers {
  it("can share a class in dependency submodule test") {
    jp.qilab.dep.proj.utils.StringTestUtil.str shouldBe "jp.qilab.dep.proj.utils.StringTestUtil$"
  }
}

