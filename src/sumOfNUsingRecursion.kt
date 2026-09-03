fun main() {

    println(sumOfN(3))
}

fun sumOfN(n: Int): Int{
    if (n==1) return 1
    return n+sumOfN(n-1)
}