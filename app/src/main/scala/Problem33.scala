/**
  * The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to simplify it may incorrectly believe that 49/98 = 4/8, which is correct, is obtained by cancelling the 9s.

  * We shall consider fractions like, 30/50 = 3/5, to be trivial examples.

  * There are exactly four non-trivial examples of this type of fraction, less than one in value, and containing two digits in the numerator and denominator.

  * If the product of these four fractions is given in its lowest common terms, find the value of the denominator.
  */
object Problem33 {
  var num = 1
  var den = 1
  def check(i: Int, j: Int) = {
    val i1 = i.toString.substring(0,1).toInt
    val i2 = i.toString.substring(1,2).toInt

    val j1 = j.toString.substring(0,1).toInt
    val j2 = j.toString.substring(1,2).toInt

//    println(i1 + " " + i2)
//    println(j1 + " " + j2)

    if (i1 == j1) {
      if (i2 * j == i * j2) {
        println(i + "/" + j + "=" + i2 + "/" + j2)
        num *= i2
        den *= j2
      }
    } else if (i1 == j2) {
      if (i2 * j == i * j1) {
        println(i + "/" + j + "=" + i2 + "/" + j1)
        num *= i2
        den *= j1
      }

    } else if (i2 == j1) {
      if (i1 * j == i * j2) {
        println(i + "/" + j + "=" + i1 + "/" + j2)
        num *= i1
        den *= j2
      }
    } else if (i2 == j2) {
      if (i1 * j == i * j1 & i2 != 0) {
        println(i + "/" + j + "=" + i1 + "/" + j1)
        num *= i1
        den *= j1
      }

    }
  }

  def main(args: Array[String]): Unit = {
    for (j<- 10 to 99)
      for (i<- 10 until j) {
//        println(i + "/" + j)
        check(i, j)
      }
    println(num + "/" + den)
    println(den / num)
  }
}












