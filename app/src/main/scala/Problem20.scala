import scala.annotation.tailrec

/**
  * <pre>
 @code{
      n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
      }
       </pre>
  */


object Problem20 {

  @tailrec
  def fakt1(i: BigInt, i1: BigInt): BigInt = {
    if (i == BigInt(1))
      i1
    else
      fakt1(i - 1, i1 * i)
  }

  def main(args: Array[String]): Unit = {
    val f = fakt1(100, 1)
    val sum = f.toString().foldLeft(0) {
      (m: Int, c: Char) => m + (c.toInt - '0'.toInt)
    }
    Console.println(sum)
  }
}