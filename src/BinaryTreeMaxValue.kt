fun main() {
    val binaryTree = intArrayOf(2, 5, 12, 8, 4,25)
    var max = 0
    binaryTree.forEach {
        if (it>max){
            max = it
        }
    }
    println(max)
}