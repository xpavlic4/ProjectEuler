

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */
object Problem9 {

  def check(a: Int, b: Int, c: Int): Unit = {
    val d = a  + b  + c
    val e = a*a + b*b
//    Console.out.println( d)
    if (d == 1000 && e == c*c && a<b && b<c) {
      Console.out.println(a + "*" + b + "*" + c + "=" + (a*b*c))
    }
  }

  def printPythagoreanTriplet(): Unit = {
    val max = 1000
    var a = 1
    var b = 1
    var c = 1
    while (c <= max) {
      while (b <= max) {
        while (a <= max) {
          check(a, b, c)
          a = a + 1
        }
        a = 0
        b = b + 1
      }
      b = 0
      c = c + 1
    }
  }

  def main(args: Array[String]) {
    printPythagoreanTriplet()
  }


}