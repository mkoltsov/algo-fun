object ScanSort {
  val sep = "\n"

  def main(args: Array[String]) {
    val input = scala.io.StdIn.readLine().split(" ").map(x=>x.toInt)
    print(mergeSort(input).deep.mkString("\n"))
  }

  def mergeSort(arr:Array[Int]): Array[Int] = {
    if (arr.size==1) {
     return arr
   }
    val m = arr.size/2
    
    val halfs = arr.splitAt(m) 
    println(s"${halfs._1.deep.mkString(sep)} - ${halfs._2.deep.mkString(sep)}") 
    val b = mergeSort(halfs._1)
    val c = mergeSort(halfs._2)
    merge(b,c)
}

def printArr(a:Array[Int]):String = a.deep.mkString(sep)

def merge(arr1:Array[Int], arr2:Array[Int]): Array[Int] = {
  // var d = Array.fill[Int](arr1.size+arr2.size)(0)
  var d = Array[Int](0)
  while (arr1.filter(_ != -1).nonEmpty && arr2.filter(_ != -1).nonEmpty) {
    println(s"arrays: ${arr1.filter(_ != -1).nonEmpty} ${arr2.filter(_ != -1).nonEmpty} ${arr1.deep.mkString(sep)} - ${arr2.deep.mkString(sep)}")
    
    val b = arr1.filter(_ != -1).head
    val c = arr2.filter(_ != -1).head

    println(s"b=$b c=$c")

    if (b<=c) {
      print(s"there - $b")
      d = d :+ b
      println(s"1 ${printArr(d)}")
      arr1(0) = -1
    } else {
      println(printArr(d:+c))
      println(s"here - $c - ${printArr(d:+c)}")
      d = d:+c
      println(s"d after concat ${printArr(d)}")
      arr2(0) = -1
    }
  }
  println(s"finally ${printArr(arr1.tail)} ${printArr(arr2.tail)}")
  val ret = d ++ arr1.tail ++ arr2.tail
  println(printArr(ret))
  ret 
}
}
