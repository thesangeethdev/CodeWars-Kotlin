fun main() {

    var intArray = intArrayOf(1,0,0,1,0,1,1,1,0,0,0)
    intArray.sort()
//    var intArray = intArrayOf(1,0,0,1)

    // initialize min value to first element of an array
    // for loop from second element of an array
    // if first > second move swap the position

    for (i in intArray.indices){//0,1,2,3
        for (j in i+1 until intArray.size){//1,2,3
            println("${intArray[i]}, ${intArray[j]}")
            if (intArray[i] > intArray[j]){//1>0,
                var temp = intArray[i]
                intArray[i] = intArray[j]
                intArray[j] = temp
            }
        }
    }
    println(intArray.contentToString())
}