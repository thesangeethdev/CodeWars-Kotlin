//fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
//
//}


// 0 1 2 3 4
// 1 0 0 0 1
//loop the plots -> 0,1,2,3,4
//
fun main() {
    val flowerbed = intArrayOf(1, 0, 0, 0, 1)
    val n = 2
    var count = 0
    var i = 0
    while (i < flowerbed.size) {

        if (flowerbed[i] == 0) {
            val emptyLeft = (i == 0) || (flowerbed[i-1] == 0)
            val emptyRight = (i == flowerbed.size-1) || (flowerbed[i+1] == 0)
            if (emptyRight && emptyLeft) {

                count += 1
                i += 2
            } else {
                i += 1
            }
        } else {
            i += 1
        }
    }
    if (count >= n) {
        print("yes")
    }
    print("no")
}