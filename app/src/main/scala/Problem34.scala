

/**
  * 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.

  * Find the sum of all numbers which are equal to the sum of the factorial of their digits.

  * Note: as 1! = 1 and 2! = 2 are not sums they are not included.
  */
object Problem34 {


  val z = new Array[Int](10)

  def fakt1(n: Int, i: Int, acc: Int): Int = {
    if (i == 1) {
      acc
    } else {
      fakt1(i, i - 1, acc * i)
    }
  }

  def fakt(a: Int): Int = {
    if (z(a) != 0)
      z(a)
    else
      fakt1(a.toInt, a.toInt, 1)
  }



  def main(args: Array[String]): Unit = {
    z(0) = 1
    z(1) = 1
    z(2) = 2
    for (f <- 3 to 9) {
      z(f) = fakt(f)
    }

    var sum = 0
    for (i1 <- 0 to 9)
      for (i2 <- 0 to 9)
        for (i3 <- 0 to 9)
          for (i4 <- 0 to 9)
            for (i5 <- 0 to 9)
              for (i6 <- 0 to 9)
                for (i7 <- 0 to 9) {
                  val ints: Array[Int] = Array(i1, i2, i3, i4, i5, i6, i7)
                  val n = ints.foldLeft(0)((a, b) => a * 10 + b)
                  val m = n.toString.map(_ - '0').map(z(_)).sum
                  if (n == m && m > 2)
                    sum = sum + n
                }
    println(sum)
  }
}












