fun main() {

    val list = listOf(3, 2, 5, 4, 1)
    val product = 10

    val hashMap = LinkedHashMap<Int, Int>()
    for (i in list.indices){
        if ( product % list[i] == 0){
            val reminder = product / list[i]
            if (hashMap.containsKey(reminder)){ //3=3
                println("${listOf(hashMap[reminder],i)}")
            }else {
                hashMap[list[i]] = i //3:0, 2:1
            }
        }
    }

}