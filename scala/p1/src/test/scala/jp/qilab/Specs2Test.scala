package jp.qilab

import org.specs2.mutable.Specification

class Specs2Test extends Specification {
  "None" should {
    "be empty" in {
      Option.empty[Int] should empty
    }
    "not be non empty" in {
      (Option.empty[Int] should not empty).not
    }
  }
  "Some" should {
    "not be empty" in {
      Some(1) should_!= empty
    }
    "be non empty" in {
      (Some(1) should_== empty).not
    }
  }
}
