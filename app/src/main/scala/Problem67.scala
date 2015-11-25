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


object Problem67 {


  def findMax(depth: Int, z: Array[Array[Int]]): Int = {
    if (depth == 0)
      z(0)(0)
    else {
      val z1: Array[Int] = z(depth)
      var i = 0
      while (i < z1.length-1) {
        val max: Int = Math.max(z1(i), z1(i+1))
        z(depth-1)(i) = z(depth-1)(i) + max
        i = i + 1
      }
      findMax(depth - 1, z)
    }
  }

  def main(args: Array[String]): Unit = {

    val tmp2: Iterator[String] = Source.fromURL(getClass.getResource("/Problem67.txt")).getLines
    val size = tmp2.size

    val z = new Array[Array[Int]](size)

    val tmp: Iterator[String] = Source.fromURL(getClass.getResource("/Problem67.txt")).getLines

    var i = 0
    while (tmp.hasNext) {
      val next: String = tmp.next()
      val split: Array[String] = next.split(' ')
      var pos = 0
      val l = new Array[Int](split.size)
      for (j <- split) {
        val int1: Int = Integer.parseInt(j)
        l(pos) = int1
        pos = pos + 1
      }
      z(i) = l
      i = i + 1
    }

    val max: Int = findMax(z.size-1, z)
    Console.out.println(max)
  }


}