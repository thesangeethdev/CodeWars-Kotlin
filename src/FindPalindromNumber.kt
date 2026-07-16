fun main() {
    println(isPalindrome(5445))
}

fun isPalindrome(x: Int): Boolean {
    val firstList = x.toString().toList()
    val secondList = x.toString().toList().reversed()
    return firstList == secondList
}