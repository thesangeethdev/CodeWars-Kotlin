fun main() {

    println(fibonacci(6))
}
fun fibonacci(n: Int): List<Int>{
    val list = mutableListOf<Int>()
    if (n == 0){
        return listOf(0)
    }
    if (n == 1){
        return listOf(0,1)
    }
    val previous = fibonacci(n-1)
    val nextNumber = previous[previous.size-1]+previous[previous.size-2]
    return previous + nextNumber
}