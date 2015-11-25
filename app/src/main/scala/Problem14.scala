
object Problem14 {

  var max :Long= 0
  var maxi: Long = 1


  def process(k: Long): Long = {
//    Console.out.println(k)
    val maybeLong: Option[Long] = z.get(k)
    if (maybeLong.isEmpty) {
      val o: Long = relax(k)
      z(k) = 1 + process(o)
      z(k)
    } else {
      maybeLong.get
    }

  }

  def relax(i: Long): Long = {
    if (i % 2 == 0)
      i / 2
    else
      3 * i + 1
  }

  val limit = 1000000
  val z = collection.mutable.Map[Long, Long]()
  z(1) = 1

  def main(args: Array[String]): Unit = {
    var i = 2
    while (i < 1000000) {
      val t = process(i)
      if (t > max) {
        max = t
        maxi = i
      }
      i = i + 1
    }
    Console.out.println(maxi)
  }

}