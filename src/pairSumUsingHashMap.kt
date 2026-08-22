fun main() {

    val list = listOf(9,9)
    val sum = 18

    val hashMap = LinkedHashMap<Int, Int>()

    for (i in list.indices) {//3, 2, 5
        val complement = sum - list[i] //5,6,3,4
        if (hashMap.containsKey(complement)){ //3=3
            println("${hashMap[complement]}, $i")
        }else {
            hashMap[list[i]] = i //3:0, 2:1
        }
    }

}