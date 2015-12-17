/**
  * In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:

  * 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
  * It is possible to make £2 in the following way:

  * 1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
  * How many different ways can £2 be made using any number of coins?
  */
object Problem31 {
  private val ints: Seq[Int] = Seq(1, 2, 5, 10, 20, 50, 100, 200)

  val limit = 200
  var count = 0

  def combinations(value: Int, start: Int, c: Seq[Int]): Unit = {
    if (value == limit) {
      count = count + 1
    } else {
      for (i <- start until ints.length) {
        val n = value + ints(i)
        if (n <= limit)
          combinations(value + ints(i), i, c :+ ints(i))
      }
    }
  }


  def main(args: Array[String]): Unit = {
    val time: Long = System.currentTimeMillis()
    combinations(0, 0, Seq())
    println(count)
    println(System.currentTimeMillis() - time)
  }
}












