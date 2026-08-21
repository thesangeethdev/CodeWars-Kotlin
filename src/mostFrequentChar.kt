fun main() {

    val str = "bookeeper"
    var max = 0
    val count  = LinkedHashMap<Char, Int>()

//    println(str.toCharArray())
    for (i in str.toCharArray()){
        count[i] = count[i]?.plus(1)?:0
    }
    count.forEach { (ch, i) ->
        if (i > max){
            max = i

        }
    }
    println(count)
    print(count.filterValues { it== max }.keys.first())
}