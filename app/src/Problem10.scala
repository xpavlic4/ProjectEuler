

object Problem10 {

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

  def main(args: Array[String]) {
    val tmp = constructPrimes()
    var s:Long = 0
    for (i<- 2 to 2000000 -1){
      if (tmp(i))
        s = s+ i
    }
    Console.out.println(s)
  }


}