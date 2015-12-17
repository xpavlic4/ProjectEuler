/**
  * We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.

  * The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, multiplier, and product is 1 through 9 pandigital.

  * Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.

  * HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.
  */
object Problem32 {

  var solution = Set[Int]()


  def toInt(ints: List[Int]): Int = {
    ints.foldLeft("")((a, b) => a + b).toInt
  }

  def check(i: Int, j: Int, p: List[Int]) = {
    val first = toInt(p.take(i))
    val second = toInt(p.slice(i, i + j))
    val third = toInt(p.slice(i + j, 9))
    if (first * second == third) {
      //      println(first + "*" + second + "=" + third)
      solution = solution.+(third)
    }

  }


  def main(args: Array[String]): Unit = {

    for (p <- Stream.from(1).take(9).toList.permutations) {
      for (i <- 1 to 8) {
        val i2: Int = 8 - i
        for (j <- 1 to i2) {
          if (i + j <= 5)
            check(i, j, p)
        }
      }
    }
    println(solution.sum)
  }
}












