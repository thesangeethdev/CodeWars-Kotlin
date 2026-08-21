import kotlin.collections.HashMap

fun main(){

    val str1 = "po"
    val str2 = "popp"

    val count1 = charCount(str1)
    val count2 = charCount(str2)
    if (count1 == count2) {
        println(true)
    } else {
        println(false)
    }
}



fun charCount (s : String) : HashMap<Char, Int>{
    val count = HashMap<Char, Int>()
    for (i in s.toCharArray()){//[p,p]
        count[i] = count[i]?.plus(1) ?: 0 //p=2
    }
    return count
}