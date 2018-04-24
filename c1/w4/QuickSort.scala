object QuickSort {
  val sep = " "

  def main(args: Array[String]) {
    val input = scala.io.StdIn.readLine().split(" ").map(x=>x.toInt)
    print(s"final ${printArr(mergeSort(input))}")
  }

  def quickSort(arr:Array[Int], l: Int, r: Int): Array[Int] = {
    if (l>=r)   return 

    val m = partitition(arr, l, r)

    quickSort(arr,l, m-1)
    quickSort(arr,m+1, r)
}

def printArr(a:Array[Int]):String = a.deep.mkString(sep)

def partitition(arr1:Array[Int], l:Int, r: Int): Array[Int] = {
  // var d = Array.fill[Int](arr1.size+arr2.size)(0)
  val x = arr1(l)
  var j=l
 
  for (i <-l+1 to r ) {
    if (arr1(i)=< x) {
      j+=1
      swap(arr1(j), arr1(i))
    }
  }

 swap(arr1(l), arr1(j))
 return j
}
