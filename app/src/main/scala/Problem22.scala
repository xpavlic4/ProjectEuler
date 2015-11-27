import scala.io.Source

/**
  * <pre>
 @code{By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

3
7 4
2 4 6
8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.

Find the maximum total from top to bottom in triangle.txt (right click and 'Save Link/Target As...'), a 15K text file containing a triangle with one-hundred rows.
      }
       </pre>
  */


object Problem22 {


  def main(args: Array[String]): Unit = {
    val tmp: Iterator[String] = Source.fromURL(getClass.getResource("/p022_names.txt")).getLines

    var s = 0
    val split = tmp.next().split(',').sorted
    for (j <- split.indices) {
      s = s + sumit(split(j)) * (j + 1)
    }
    println(s)
  }

  def sumit(str: String): Int = {
    str.filter(_ != '"').map(c => c.toInt - 'A'.toInt + 1).sum
  }
}