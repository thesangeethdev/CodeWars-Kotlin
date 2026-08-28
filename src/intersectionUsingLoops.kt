import java.util.stream.Collectors

fun main() {

    val a = listOf(0,1,2)
    val b = listOf(10,1,2)
    val results = mutableListOf<Int>()
//
    for (i in a.indices) {
        for (j in b.indices) {
            if (a[i] == b[j]) {
                results.add(i)
            }
        }
    }
    println(results)
//    println(a.stream().filter { item -> b.contains(item) }.collect(Collectors.toList()))

}