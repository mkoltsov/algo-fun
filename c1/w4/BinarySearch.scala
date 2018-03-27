object LinearSearch {
  def main(args: Array[String]) {
    val input = scala.io.StdIn.readLine().split(" ").map(x=>x.toInt)
    val key= scala.io.StdIn.readInt()

    print(linearSearchRec(input, 0, key))

  }

  def linearSearchRec(arr:Array[Int],start:Int, key:Int ):Int = {
    if (start>=arr.size)  	return -1
  	val elem=arr(start)
  	if (elem==key) {
  	 return start
  	 } else if (elem<key) {
  	 	linearSearchRec(arr, start+(arr.size - start)/2, key)
  	 } else  return -1	
  }
}