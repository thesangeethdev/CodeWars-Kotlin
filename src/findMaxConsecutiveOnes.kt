fun findMaxConsecutiveOnes(nums: IntArray): Int {

    var loopCount = 0
    var finalCount = 0
    var count = 0

    // [1,1,0,1,1,1]
    for (i in nums.indices) { // indices = 5
        if (nums[i] == 1) { // 1 = 1, 1=1, 0=1, 1=1, 1=1, 1=1
            count += 1 // 1, 2, 1, 2, 3
            loopCount = count // 1, 2, 1, 2, 3
            if (loopCount>finalCount){
                finalCount = loopCount
            }
        } else {
            if (loopCount > finalCount) {//2>0
                finalCount = loopCount //2
            }
            count = 0 //
            loopCount = 0

        }
    }

    return finalCount
}
fun main() {
    println(findMaxConsecutiveOnes(intArrayOf(1,1,0,1,1,1)))
}
// we have an array of integer
//initialize the count = 0
// we need to loop in
// check first index 1 or 0
// if its 1 count ++
// check next index 1 or 0
//if its 1 count ++ else count 0
// lets say count = 2 at one point next is 0 then dont count it just save the count to target
//
//fun main() {
//    //[1,1,0,1,1,1] -> output 3
//    val nums = intArrayOf(1,1,0,1,1,1)
//    var loopCount = 0
//    var finalCount = 0
//    var count = 0
//
//    // [1,1,0,1,1,1]
//    for (i in nums.indices) { // indices = 5
//        if (nums[i] == 1) { // 1 = 1, 1=1, 0=1, 1=1, 1=1, 1=1
//            count += 1 // 1, 2, 1, 2, 3
//            loopCount = count // 1, 2, 1, 2, 3
//            if (loopCount>finalCount){
//                finalCount = loopCount
//            }
//        } else {
//            if (loopCount > finalCount) {//2>0
//                finalCount = loopCount //2
//            }
//            count = 0 //
//            loopCount = 0
//
//        }
//    }
//    println(finalCount)
//}

//lets say finalcount = 2
//next iteration we got 0 -> then count and final count become 0
// so it only returns the final count not maxcount of 0