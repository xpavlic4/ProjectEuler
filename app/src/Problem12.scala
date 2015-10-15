

/**
 * The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over five hundred divisors?
 */
object Problem12 {


  def triangle(i: Long): Long = {
    var a: Long = 0
    var tmp: Long = 0
    while (tmp <= i) {
      a = a + tmp
      tmp = tmp + 1
    }
    a
  }

  def divisors(t: Long): Int = {
    var c = 0
    var tmp: Long = 2
    val d = 1
    val sqrt: Double = Math.sqrt(t)
    while (tmp <= sqrt) {
      if (t % tmp == 0) {
        c = c + 2
      }
      tmp = tmp + 1
    }
    c
  }

  def main(args: Array[String]) {
        var found = false
        var i:Long = 0
        val limit : Int= 500
        var max = 0
        while (!found) {
          val t = triangle(i)
    //      Console.out.println(i)
          val divisors1: Int = divisors(t)
          if (divisors1 > limit) {
            found = true
            Console.out.println(t)
          } else {

          }
          i  = i + 1
        }


  }

}