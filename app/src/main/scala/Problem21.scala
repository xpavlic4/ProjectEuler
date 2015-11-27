

/**
  * <pre>
 @code{
      Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
      }
       </pre>
  */


object Problem21 {

  def d(i: Int, sum: Int): Int = {
    var sum = 0
    for (j<- 1 until i) {
      if (i % j == 0){
        sum = sum + j
      }
    }
    sum
  }

  val z = new Array[Int](10000)

  def main(args: Array[String]): Unit = {
    for (i <- 1 until 10000) {
      z(i) = d(i, 0)
    }
    var sum = 0
    for (i <- 1 until 10000) {
      val value: Int = z(i)
      if (i != value && i == z(value)) {
        sum = sum + i
        println(i +  "->" + value)
      }
    }
    println(sum)
  }
}