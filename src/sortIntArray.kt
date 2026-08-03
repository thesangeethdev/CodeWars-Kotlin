import kotlin.math.min

fun main() {

    // get first element
    // compare first element with other elements
    //
    var arr = mutableListOf(3,17,5,1,10)

    for (i in 1 until arr.size){
        for (j in 1 until arr.size){
            if(arr[i] > arr[j]){ //3>17, 3>5, 3>1
//                val temp = arr[j] //1
                arr[i-1] = arr[j] //1
//                arr[j] = temp
            }
        }

    }
    println(arr)
}