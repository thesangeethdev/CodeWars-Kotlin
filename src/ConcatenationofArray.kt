fun getConcatenation(nums: IntArray): IntArray {
    return nums.plus(nums)
}
fun main() {
    println(getConcatenation(intArrayOf(1,4,1,2)).contentToString())
}