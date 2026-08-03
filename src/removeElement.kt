fun removeElement(nums: IntArray, `val`: Int): Int {

    var count = 0
    nums.forEachIndexed { index, i ->
        if (nums[index] != `val`){
            nums[count] = i
            count+=1
        }
    }
    return count
}

fun main() {

    println(removeElement(intArrayOf(0,1,2,2,3,0,4,2), 2))
//    val value = 3
//    val nums = intArrayOf(3,2,2,3)
//    var newArray = emptyArray<Int>()
//    var k = 0
//    nums.forEachIndexed { index, i ->
//        if (nums[index] != value){
//            newArray = newArray.plus(i)
//        }
//    }
////    for (i in nums.indices){
////        if (nums[i] != value){
////            newArray[k] = i
////            k+=1
////        }
////    }
//    println(newArray.size)
}