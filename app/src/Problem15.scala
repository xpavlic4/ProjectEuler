import scala.annotation.tailrec

object Problem15 {
  def latticePaths(i: Int) = {
    fact(i) / (fact(i / 2) * fact(i - i / 2))
  }

  def fact(i: BigInt) : BigInt = {
    fakt(i, 1)
  }

  @tailrec
  def fakt(i: BigInt, acc: BigInt) : BigInt  ={
    if (i == BigInt(1)) {
      acc
    } else {
      fakt(i - 1, i *acc)
    }
  }
  def main(args: Array[String]): Unit = {
    Console.out.println(latticePaths(40))
  }


}