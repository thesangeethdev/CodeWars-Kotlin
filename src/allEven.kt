fun main() {

    val numArray = intArrayOf(4, 90, 68, 6, -3)

    var isEven = true

    for (i in numArray){
        if (i % 2 != 0){
            isEven = false
        }
    }
    println(isEven)
}