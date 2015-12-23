object Problem35 {

  def comb1(c: String, l:Int, co:Int):Unit = {
    if (co == 0) {
//      println(c)
      count = count + 1
    }else {
      val substring: String = c.substring(0,l)
      if (z(substring.toInt)) {
        comb1(c.substring(1), l, co-1)
      }
    }

  }

  def comb(j: Int) = {
    val str = j.toString
    val c = str + str
    comb1(c, str.length, str.length)
  }
  var count = 0
  val limit = 1000000
  val z = new Array[Boolean](limit)
  def main(args: Array[String]): Unit = {
    for (j <- z.indices)
      z(j) = true

    for (k <- 2 until Math.sqrt(limit).round.toInt) {
      if (z(k)) {
        var tmp = k * k
        while (tmp < limit) {
          z(tmp) = false
          tmp = tmp + k
        }
      }
    }

    for (j <- 2 until limit) {
      comb(j)
    }
    println(count)
  }
}












