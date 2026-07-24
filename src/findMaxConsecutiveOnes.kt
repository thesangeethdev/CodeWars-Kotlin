fun findMaxConsecutiveOnes(nums: IntArray): Int {

//    var loopCount = 0
    var finalCount = 0
    var count = 0

    // [1,1,0,1,1,1]
    nums.forEach {
        if (it == 1) count += 1 //1,2,na, 1, 2, 3
        else {
            count = 0 // na, na, 0, na, na, na
        }
        finalCount = Math.max(finalCount, count) // 1, 2, 2, 2, 2, 3
    }
    return finalCount
}

fun main() {
    println(findMaxConsecutiveOnes(intArrayOf(1, 1, 0, 1, 1, 1)))
}
