fun replaceElements(arr: IntArray): IntArray {

    var maxSOFar = -1 //2
    for (i in arr.size - 1 downTo 0) {
        val current = arr[i] // 2,
        arr[i] = maxSOFar // 2 replace by -1
        if (current > maxSOFar) // 2 > -1
        {
            maxSOFar = current // 2-1
        }
    }
    return arr
}

fun main() {
    println(replaceElements(intArrayOf(2, 4, 5, 3, 1, 2)).contentToString())
}