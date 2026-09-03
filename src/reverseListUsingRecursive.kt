fun main() {

    val head = listOf(0,1,2,3)
    println(reverseList(head))
}

fun reverseList(head: List<Int>): List<Int>{

    if (head.size <= 1) return head

    val newHead = reverseList(head.drop(1))

    return newHead + head.first()
}