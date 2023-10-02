object ErrorHandlingPractice {
  private def makeInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s))
    } catch {
      case e: Exception => None
    }
  }

  def main(args: Array[String]): Unit = {
    println(ErrorHandlingPractice.makeInt("123"))
    println(ErrorHandlingPractice.makeInt("not a num"))
    println(ErrorHandlingPractice.makeInt("not a num but contains 1"))
  }
}
