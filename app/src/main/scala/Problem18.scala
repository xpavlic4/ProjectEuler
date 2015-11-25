import scala.io.Source

/**
  * <pre>
 @code{
      By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

3
7 4
2 4 6
8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.

Find the maximum total from top to bottom of the triangle below:

75
95 64
17 47 82
18 35 87 10
20 04 82 47 65
19 01 23 75 03 34
88 02 77 73 07 63 67
99 65 04 28 06 16 70 92
41 41 26 56 83 40 80 70 33
41 48 72 33 47 32 37 16 94 29
53 71 44 65 25 43 91 52 97 51 14
70 11 33 28 77 73 17 78 39 68 17 57
91 71 52 38 17 14 91 43 58 50 27 29 48
63 66 04 68 89 53 67 30 73 16 69 87 40 31
04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
      }
       </pre>
  */


object Problem18 {


  def findMax(depth: Int, pos: Int, max: Int, z: Array[Array[Int]]): Int = {
    if (depth >= z.size)
      max
    else {
      val z1: Array[Int] = z(depth)
      val max1= findMax(depth +1, pos, max + z1(pos), z)
      val max2 = findMax(depth +1, pos+1, max + z1(pos), z)
      val ret = Math.max(max1, max2)
      ret
    }
  }

  def main(args: Array[String]): Unit = {

    val tmp2: Iterator[String] = Source.fromURL(getClass.getResource("/Problem18.txt")).getLines
    val size = tmp2.size

    val z = new Array[Array[Int]](size)

    val tmp: Iterator[String] = Source.fromURL(getClass.getResource("/Problem18.txt")).getLines

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

    val max: Int = findMax(0, 0, 0, z)
    Console.out.println(max)
  }


}