fun main() {

    val list = listOf(3, 2, 5, 4, 1)
    val sum = 8

    for (i in list.indices){
        for (j in i+1 until list.size){
            if (list[i] + list[j] == sum){
                print("$i, $j")
            }
        }
    }
}