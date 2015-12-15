/**
  * Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

  * 1634 = 14 + 64 + 34 + 44
  * 8208 = 84 + 24 + 04 + 84
  * 9474 = 94 + 44 + 74 + 44
  * As 1 = 14 is not a sum it is not included.

  * The sum of these numbers is 1634 + 8208 + 9474 = 19316.

  * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
  */
object Problem30 {
  def main(args: Array[String]): Unit = {
    var sum = 0
    for (i1 <- 0 to 9)
      for (i2 <- 0 to 9)
        for (i3 <- 0 to 9)
          for (i4 <- 0 to 9)
            for (i5 <- 0 to 9)
              for (i6 <- 0 to 9) {
                val ints: Array[Int] = Array(i1, i2, i3, i4, i5, i6)
                val n = ints.foldLeft("")((a, b) => a + b).toInt
                val m = ints.map(Math.pow(_, 5)).sum
                if (n == m) {
                  //              println(n)
                  sum = sum + n
                }
              }
    println(sum - 1)
  }
}