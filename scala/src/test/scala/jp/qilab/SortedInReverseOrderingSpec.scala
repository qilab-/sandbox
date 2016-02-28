package jp.qilab

import org.scalatest.{FunSpec, Matchers}
import org.scalatest.enablers.Sortable

class SortedInReverseOrderingSpec extends FunSpec with Matchers {

  describe("sortedInReverseOrder") {
    it("should pass the test if the list is sorted in reverse order") {
      val sortedInts = List(1, 4, 6, 7, 8, 12)
      val reverseSortedInts = List(32, 21, 15, 3, 2, -1, -6)

      val reverseOrdering = Ordering.by[Int, Int](_ * (-1))
      val inReverseOrder: Sortable[List[Int]] = Sortable.sortableNatureOfSeq[Int, List](reverseOrdering)
      // reverseSortedInts shouldBe (sorted) (inReverseOrder)
      (reverseSortedInts shouldBe (sorted)) (inReverseOrder)
      reverseSortedInts.shouldBe(sorted)(inReverseOrder)
      reverseSortedInts.shouldBe(sorted)(Sortable.sortableNatureOfSeq[Int, List](implicitly[Ordering[Int]].reverse))
      reverseSortedInts.reverse shouldBe sorted
    }
  }

}
