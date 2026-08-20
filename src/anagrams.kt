fun main() {

    val str1 = "cats"
    val str2 = "tocs"

    val hashSet1 = str1.toHashSet()
    println(hashSet1)
    val hashSet2 = str2.toHashSet()
    println(hashSet2)

    val substract = hashSet1.subtract(hashSet2)

    println(substract)
    if (substract.isEmpty()){
        println(true)
    }else{
        println(false)
    }
}