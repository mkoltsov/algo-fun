object Brackets {
  val sep = " "

  case class Stack() {
    private var interal = Array[String]()

    def push(elem:String) = interal:+=elem
    def pop() = {
      val tail = interal.last
      interal = interal.init
      tail
    }

    override def toString():String=internal.deep.mkString(" ")
  }

  def main(args: Array[String]) {
    val value = scala.io.StdIn.readInt()
    // val coins = scala.io.StdIn.readLine().split(" ").map(x=>x.toInt)
    val minNumCoins=Array(0)

    for (w <- 1 to value) {
      minNumCoins(w) = 0
      for (i <- Array(6,3,4,2)) {
        if (m >= i) {
          val numCoins = minNumCoins(m-i) +1 
          if (numCoins < minNumCoins(m)) {
            minNumCoins(m) = numCoins
          }
        }
      }
    }

    print(minNumCoins(money))
  } 
}