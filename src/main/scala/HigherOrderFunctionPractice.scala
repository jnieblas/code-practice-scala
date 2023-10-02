object HigherOrderFunctionPractice {
  private def printLists(): Unit = {
    println("printLists()")
    println(List("bob", "joe").map(_.toUpperCase))
    println(List("bob", "joe").map(_.capitalize))
    println(List("plum", "banana").map(_.length))
  }

  private def fruits(): Unit = {
    println("fruits()")
    val fruits = List("apple", "pear")
    println(fruits.map(_.toUpperCase))
    println(fruits.flatMap(_.toUpperCase))
  }

  private def nums(): Unit = {
    println("nums()")
    val nums = List(5, 1, 3, 11, 7)
    println(nums.map(_ * 2))
    println(nums.filter(_ > 3))
    println(nums.takeWhile(_ < 6))
    println(nums.sortWith(_ < _))
    println(nums.sortWith(_ > _))

    println(nums.takeWhile(_ < 6).sortWith(_ < _))
  }

  def main(args: Array[String]): Unit = {
    printLists()
    fruits()
    nums()
  }
}
