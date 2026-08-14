fun main() {

    //get first element
    // compare first element with other elements
    //
    val arr = intArrayOf(4, 7, 2, 8, 10, 9)
    var max = arr[0]

    for (i in arr){
        if(i>max){
            max = i
        }
    }
    println(max)

}