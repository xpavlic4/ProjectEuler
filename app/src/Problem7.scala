object Problem7 {

  def main(args: Array[String]) {
    printPrimes()
  }

  def printPrimes() = {
    val n: Int = 110001
    val z = new Array[Boolean](n)
    for (j <- z.indices)
      z(j) = true

    for (k <- 2 to 1001) {
      if (z(k)) {
        var tmp = k * k
        while (tmp < n) {
          z(tmp) = false
          tmp = tmp + k
        }
      }
    }
    var count = 1

    for (l <- 2 to n - 1) {
      if (z(l)) {
        Console.out.println(count + ": " + l)
        count = count + 1
      }
    }
  }
}