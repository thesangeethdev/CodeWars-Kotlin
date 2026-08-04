fun main() {
    var intArray = intArrayOf(1,0,0,1,0,1,1,1,0,0,0)
    for (i in intArray.indices){//0,1,2,3
        for (j in i+1 until intArray.size){//1,2,3
            println("${intArray[i]}, ${intArray[j]}")
            if (intArray[i] < intArray[j]){//1>0,
                var temp = intArray[i]
                intArray[i] = intArray[j]
                intArray[j] = temp
            }
        }
    }
    println(intArray.contentToString())
}