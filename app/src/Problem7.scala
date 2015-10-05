object Problem7 {

  def main(args: Array[String]) {
   var i = 2
    Console.out.println(isPrime(2))
    Console.out.println(isPrime(3))
    Console.out.println(isPrime(17))
    Console.out.println(isPrime(15))
  }

  def isPrime(i: Int) = {
    isPrimeAcc(2, i)
  }
  def isPrimeAcc(i:Int, j:Int) = {
    var tmp = i
    while (tmp % j != 0) {
      tmp = tmp +1
    }
    tmp == j
  }
}