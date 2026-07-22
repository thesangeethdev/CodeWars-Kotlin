fun twoSum(nums: IntArray, target: Int) : IntArray{

    for (i in nums.indices){
        for (j in 1 until nums.size){
            if (nums[i]+nums[j] == target && i != j){
                return intArrayOf(i,j)
            }
        }
    }

    return intArrayOf()
}

fun main() {
    println(twoSum(nums = intArrayOf(2,5,5,11), target = 10).contentToString())
}
