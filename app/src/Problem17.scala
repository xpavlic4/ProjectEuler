

/**
  * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
The use of "and" when writing out numbers is in compliance with British usage.
  */
object Problem17 {


  def count(t: String): Int = {
    if (t.toInt % 100 == 0) {
      val i = t.charAt(0) - '0'
      z(i) + "hundred".length

    } else {
      val j: String = t.reverse
      val size = j.length
      var i = 0
      var count = 0
      while (i < size) {
        val at: Char = j.charAt(i)
        val of: Int = at - '0'
        if (i == 0) {
          count += z(of)
        } else        if (i == 1) {
          if (of == 1) {
            count = 0
            val at1: Char = j.charAt(i - 1)
            val i1: Int = at1 - '0'
            count += y(i1)
          } else {
            count += ties(of)
          }
          if (j.length > 2) {
            count += 3
          }
        } else
        if (i == 2) {
          count += z(of)
          count += 7

        }
        i = i + 1
      }
      count
    }
  }
  val z = Array(0, 3, 3, 5, 4, 4, 3, 5, 5, 4)
  //          ten eleven twelve thirteen fourteen fifteen sixteen seventeen eighteen nineteen
  val y = Array(3, 6,    6,     8,        8,      7,       7,     9,        8,       8)
  //                    twenty  thirty  forty   fifty   sixty seventy eighty  ninety
  val ties = Array(0, 0, 6,     6,      5,      5,      5,    7,      6,      6)

  def letters(i: Int): Int = {
    val j = i + ""
    val c = count(j)
//    Console.out.println(i + ":" + c)
    c
  }

  def main(args: Array[String]): Unit = {
    val test2 = letters(100)
    Console.out.println("100: " + test2)

//     three hundred forty two
    val test1 = letters(342)
    Console.out.println("342: " + test1)
//     three hundred forty two
    val test3 = letters(115)
    Console.out.println("115:" + test3)


    var count: Int = test(1, 1000)
    count += 11
    Console.out.println(count)

    Console.out.println("3 + 3 + 5 +4 + 4 +3 +5 +5 +4 = 36")
    Console.out.println(test(1, 10) )
    Console.out.println("3 + 6 + 6 + 8 + 8 + 7 + 7 + 9 + 8 + 8 = 70")
    Console.out.println(test(10, 20) )
    Console.out.println("10*(6 + 6 + 5 + 5 + 5 + 7 + 6 + 6) + 8*36 = 748")
    Console.out.println(test(20, 100) )

    Console.out.println(test(100, 1000) )

  }
  def test(low: Int, limit: Int): Int = {
    var i = low
    var count = 0
    while (i < limit) {
      val letters1: Int = letters(i)
      count += letters1
//      Console.out.println(i + ":" + letters1)
      i = i + 1
    }
    count
  }


}