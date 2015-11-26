import java.text.SimpleDateFormat
import java.util.{Calendar, Date}

/**
  * <pre>
 @code{You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?}
       </pre>
  */





object Problem19 {

  def main(args: Array[String]): Unit = {
    val dayFormat = new SimpleDateFormat("yyyyMMdd")
    var first: Date = dayFormat.parse("19010101")
    val last: Date = dayFormat.parse("20010101")

    var count = 0
    while (first.before(last)) {
      val instance: Calendar = Calendar. getInstance()
      instance.setTime(first)
      val i: Int = instance.get(Calendar.DAY_OF_WEEK)
      if (i == Calendar.SUNDAY) {
        Console.println(first)
        count = count + 1
      }

      instance.add(Calendar.MONTH, 1)
      first = instance.getTime
    }
    Console.println(count)
  }


}