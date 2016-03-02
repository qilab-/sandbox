package jp.qilab

case class ReturnTypeCheck[A, B](a: A) {

}

object ReturnTypeCheck {
  def check[A, B](c: ReturnTypeCheck[A, B]): B = ???
}

