

/**
  * 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.

  * Find the sum of all numbers which are equal to the sum of the factorial of their digits.

  * Note: as 1! = 1 and 2! = 2 are not sums they are not included.
  */
object Problem34 {


  val z = new Array[Int](10000)

  def fakt1(n: Int, i: Int, acc: Int): Int = {
    if (i == 1) {

      acc
    }

    else {
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
    z(0) = 0
    for (f <- 1 to 9) {
      val fakt2: Int = fakt(f)
      z(f) = fakt2
      println(f + " " + fakt2)
    }
    for (i <- Stream.from(3)) {
      val string: String = i.toString
      val array: Array[Char] = string.toCharArray
      var sum = 0
      for (c <- array) {
        sum += z(c -'0')
      }
      if (sum == i) {
        println(i + " " + sum)
      }
    }
  }
}












