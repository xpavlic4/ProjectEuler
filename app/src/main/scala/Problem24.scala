

/**
  * <pre>
 @code{}
       </pre>
  */


object Problem24 {
 object LexiOrdering extends Ordering[List[Int]] {
   override def compare(x: List[Int], y: List[Int]): Int = x.mkString compare(y.mkString)
 }

  def main(args: Array[String]): Unit = {
    val stream: Stream[List[Int]] = List(0,1,2,3,4,5,6,7,8,9).permutations.toStream
    val take: Stream[List[Int]] = stream.take(10000000)
    println(take(1000000).mkString)
  }


}