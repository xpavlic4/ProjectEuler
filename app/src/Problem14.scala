

/**

 */

import scala.collection.mutable
import scala.collection.mutable.MutableList
object Problem14 {

  var max = 0
  var maxi = 1

  def update(list: mutable.MutableList[Long]) = {
    for (i<-list.indices)
  }

  def process(k: Int) = {
    var i = k
    var count = 0
    var list = MutableList[Long]()
    do {
        list += i.toLong
        i = relax(i)
        count = count + 1
    } while (i != 1)
    update(list)
  }
  def relax(i: Int):Int = {
    if (i % 2 == 0)
       i /2
    else
      3 * i + 1
  }

  val limit = 1000000
  val z = new Array[Long](limit)
  for (j <- z.indices)
    z(j) = 0

  def main(args: Array[String]): Unit = {
    var i = 2
    while (i < 1000000) {
      Console.out.println(i)
      process(i)
      i = i + 1
    }
    Console.out.println(maxi)
  }

}