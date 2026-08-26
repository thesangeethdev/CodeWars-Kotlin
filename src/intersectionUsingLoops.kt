import java.util.stream.Collectors

fun main() {

    val a = listOf(0,1,2)
    val b = listOf(10,11)
//
//    for (i in a.indices) {
//        for (j in b.indices) {
//            if (a[i] == a[j]) {
//                print(listOf(a[i], b[j]))
//            }
//        }
//    }
    println(a.stream().filter { item -> b.contains(item) }.collect(Collectors.toList()))

}