object ErrorHandlingPractice {
  private def makeInt(s: String): Option[Int] =
    try
      Some(Integer.parseInt(s))
    catch
      case e: Exception => None

  private def printInt(i: Option[Int]): Unit =
    i match
      case Some(i) => println(i)
      case None => println("not a num")

  def main(args: Array[String]): Unit =
    printInt(makeInt("123"))
    printInt(makeInt("not a num"))
    printInt(makeInt("not a num but contains 1"))

    val string1 = "1"
    val string2 = "2"
    val string3 = "3"

    val y = for
      a <- makeInt(string1)
      b <- makeInt(string2)
      c <- makeInt(string3)
    yield
      a + b + c

    printInt(y)
}
