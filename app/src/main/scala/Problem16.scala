import scala.annotation.tailrec

object Problem16 {

  @tailrec
  def sum(s: String, acc: Int):Int = {
    if (s.isEmpty)
      acc
    else {
      val at = s.substring(0, 1)
      sum(s.substring(1, s.length), acc + at.toInt)
    }
  }

  def main(args: Array[String]): Unit = {
   val b : BigInt = 2
    val pow = b.pow(1000)
//    Console.out.println(pow)
    Console.out.println(sum(pow + "", 0))
  }


}