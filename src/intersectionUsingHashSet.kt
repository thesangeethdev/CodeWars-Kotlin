fun main() {

    val a = listOf(0,1,2)
    val b = listOf(10,11)
    val results = mutableListOf<Int>()

    val newSet = a.toSet()
    for (i in b.indices){
        if (newSet.contains(b[i])){
            results.add(b[i])
        }
    }

    println(results)
}