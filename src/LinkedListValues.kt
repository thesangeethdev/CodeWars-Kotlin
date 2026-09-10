import Source.linkedListValues

class Node<T>(var `val`: T) {
    var next: Node<T>? = null
}

object Source {
    fun linkedListValues(head: Node<String>?): List<String> {
        val list = mutableListOf<String>()
        var current: Node<String>? = head
        while (current != null) {
            list.add(current.`val`)
            current = current.next
        }
        return list
    }


}

fun main() {

    println(linkedListValues(null))
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function, but should not remove it
}