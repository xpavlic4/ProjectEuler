

/**
  * <pre>
 @code{A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example,
           the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.

A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.

As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24.
      By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers.
      However, this upper limit cannot be reduced any further by analysis even though it is known
      that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.

Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.}
       </pre>
  */


object Problem23 {


  def isSumOfAbudant(i: Int): Boolean = {
    for (j <- 1 until i) {
      if (a(j) && a(i - j) ) {
        return true
      }
    }
    false
  }

  val a = new Array[Boolean](28124)

  def main(args: Array[String]): Unit = {
//    println(isPerfect(28))
//    println(isAbundant(12))

    for (i <- 1 until 28124) {
      a(i) = isAbundant(i)
    }

//    println(isSumOfAbudant(24))

    var sum = 0
    for (i <- 1 until 28124) {
      if (!isSumOfAbudant(i)) {
        println(i)
        sum = sum + i
      }
    }
    println(sum)

    //    println(a.groupBy(_ == true).values.map(a => a.size))
  }

  def perfect(str: Int) = {
    val half = str -1
    var i = 1
    var sum = 0
    while (i <= half) {
      if (str % i == 0) {
        sum += i
        //        println(i)
      }
      i = i + 1
    }
    sum
  }

  def isPerfect(i: Int) = {
    perfect(i) == i
  }

  def isAbundant(i: Int) = {
    perfect(i) > i
  }
}