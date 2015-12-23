object Problem36 {
  def main(args: Array[String]): Unit = {
    val t = Stream.from(1).take(1000000).filter(a=> a.toString == a.toString.reverse).filter(i => i.toBinaryString == i.toBinaryString.reverse).sum
    println(t)
  }
}












