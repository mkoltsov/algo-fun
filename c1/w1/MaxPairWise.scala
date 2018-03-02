object MaxPairWise {
  def main(args: Array[String]) {
    val inputNumber = scala.io.StdIn.readInt
    val input = scala.io.StdIn.readLine().split(" ").map(x=>x.toLong)
    if (input.size < 2) {
    	println("Abnormal size, exitting")
    	System.exit(0)
    }
    var maxI:Long=0
    var maxI2:Long=0


    for (i<- input) {
    	if (i>maxI) maxI=i 
    }

    for (i<- input) {
    	if (i>maxI2 && i!=maxI) maxI2=i
    }

    println(s"${maxI*maxI2}")
  }

}
