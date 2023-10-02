object FunctionalPractice {
  def sum(xs: List[Int]): Int = xs match
    case Nil => 0
    case head :: tail => head + sum(tail)

  val nums: List[Int] = (1 to 10).toList

  def underFive(i: Int): Boolean = i < 5

  val doubles: List[Int] = nums.filter(underFive).map(_ * 2) // double each value

  val double = (i: Int) => i * 2


  def main(args: Array[String]): Unit = {
    println(sum(List(1, 2, 3)))
    println(doubles)
  }
}