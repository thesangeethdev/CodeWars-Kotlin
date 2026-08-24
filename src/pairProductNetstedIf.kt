fun main() {

    val list = listOf(4, 7, 9, 2, 5, 1)
    val product = 5

    for (i in list.indices){
        for (j in i+1 until list.size){
            if (list[i] * list[j] == product){
                print("$i, $j")
            }
        }
    }
}