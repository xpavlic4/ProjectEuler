

/**
  *
  * <pre>
  *
  *@code{
           Euler discovered the remarkable quadratic formula:

n² + n + 41

It turns out that the formula will produce 40 primes for the consecutive values n = 0 to 39. However, when n = 40, 402 + 40 + 41 = 40(40 + 1) + 41 is divisible by 41, and certainly when n = 41, 41² + 41 + 41 is clearly divisible by 41.

The incredible formula  n² − 79n + 1601 was discovered, which produces 80 primes for the consecutive values n = 0 to 79. The product of the coefficients, −79 and 1601, is −126479.

Considering quadratics of the form:

n² + an + b, where |a| < 1000 and |b| < 1000

where |n| is the modulus/absolute value of n
e.g. |11| = 11 and |−4| = 4
Find the product of the coefficients, a and b, for the quadratic expression that produces the maximum number of primes for consecutive values of n, starting with n = 0.
      }
       </pre>
  */


object Problem27 {


  def analyze(i: Int, j: Int) = {
    var count = 0
    var prime = true
    var c = 0
    while (prime) {
      val nr  = c*c + c * i + j
      if (z(Math.abs(nr))) {
        count = count + 1
      } else {
        prime = false
      }
      c = c + 1
    }
    if (count > max) {
      max = count
      maxi = i
      maxj = j

    }
  }

  def constructPrimes() = {

    val n: Int = 2000000
    val z = new Array[Boolean](n)
    for (j <- z.indices)
      z(j) = true

    val o = Math.sqrt(n).toInt
    for (k <- 2 to o) {
      if (z(k)) {
        var tmp = k * k
        while (tmp < n) {
          z(tmp) = false
          tmp = tmp + k
        }
      }

    }
    z
  }
  var product = 0
  val z = constructPrimes()
  var max = 0
  var maxi = 0
  var maxj = 0

  def main(args: Array[String]): Unit = {

    for (i <- 1 until 1000) {
      for (j <- 1 until 1000) {
        if (z(j)) {
          analyze(i, j)
          analyze(i, -j)
          analyze(-i, j)
          analyze(-i, -j)
        }
      }
    }
    println("Number of primes=" +max + " with " + maxi + "*" + maxj + "=" + (maxi * maxj))
  }
}