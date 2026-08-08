//fun majorityElement(nums: IntArray): Int {
//
//
//}

fun main() {

    val nums = intArrayOf(5,5,1,1,1,5,5)
    // sorting -> 1,1,1,5,5,5,5
    nums[7/2]
//    val nums = intArrayOf(2,2,2)
    // loop the nums array
    // initialize the variables called count
    var number = 0
    var count = 0
    nums.forEach { num ->//5,5,1,1,1,5
        if (count == 0){
            number = num// 5
        }
        if (num == number){
            count += 1//1,2,1
        }
        else{
            count =- 1 //1,0
        }
    }
    println(number)
}