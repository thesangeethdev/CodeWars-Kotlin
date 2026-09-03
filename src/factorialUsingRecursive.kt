fun main() {

    println(factorial(5))
}

fun factorial(n : Int): Int{
    if (n == 1) return 1 // 5 == 1 false, 4==1 false,

    return n * factorial(n-1) //5* factorial(4), 
}