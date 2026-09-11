import Source.linkedListValuesRecursive

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

    fun linkedListValuesRecursive(head: Node<String>?): List<String> {
        val list = mutableListOf<String>()
        val current : Node<String>? = head

        if (current == null) return emptyList()
        list.add(current.`val`)
        return list + linkedListValuesRecursive(current.next)
    }


}

fun main() {

    val a = Node<String>("a")
    val b = Node<String>("b")
    val c = Node<String>("c")
    val d = Node<String>("d")
    a.next = b
    b.next = c
    c.next = d
    println(linkedListValuesRecursive(a))
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function, but should not remove it
}