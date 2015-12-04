
object Problem28 {

  def process(step: Int, i: Int, sum: Int): Int = {
    if (i >= 1001 * 1001) {
      sum
    } else {
      val i1: Int = i + step
      val i2: Int = i1 + step
      val i3: Int = i2 + step
      val i4: Int = i3 + step

      println(sum + "=" + i1 + "+" + i2 + "+" + i3 + "+" + i4)
      process(step + 2, i4, sum + i1 + i2 + i3 + i4)
    }
  }


  def main(args: Array[String]): Unit = {
    println(process(2, 1, 1))

  }
}