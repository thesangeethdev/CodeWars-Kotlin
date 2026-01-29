fun main() {
    var input = "Hello World!"
    var charList = input.toCharArray().toList()
    var results = charList.zip(charList).flatMap{listOf(it.first, it.second)}
    println(results.joinToString(""))
}