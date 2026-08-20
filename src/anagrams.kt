fun main() {

    val str1 = "cats"
    val str2 = "tocs"

    val charArray1 = str1.toCharArray().toSortedSet()
    println(charArray1)
    val charArray2 = str2.toCharArray().toSortedSet()
    println(charArray2)

    if (charArray1 == charArray2){
        println(true)
    }else{
        println(false)
    }
}