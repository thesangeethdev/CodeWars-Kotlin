fun main() {

    val longestWord = "what a wonderful world"
    var longest = ""
    val splitArray = longestWord.split(" ")

    for (i in splitArray){
        if (i.length > longest.length){
            longest = i
        }
    }
    println(longest)
}