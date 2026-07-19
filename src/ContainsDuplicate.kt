fun hasDuplicate(nums: IntArray): Boolean {

    var stack = mutableListOf<Int>()
    for (i in nums){

        if (stack.contains(i)){
            return true
        }
        stack.add(i)
    }
    return false
}

fun main() {
    println(hasDuplicate(intArrayOf(1, 2, 3, 4)))
}

