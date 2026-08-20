fun main() {

    val str1 = "paper"
    val str2 = "reapa"

    val charArray1 = str1.toCharArray()
    println(charArray1)
    val charArray2 = str2.toCharArray()
    println(charArray2)

    if (charArray1.contentEquals(charArray2)){
        println(true)
    }else{
        println(false)
    }
}