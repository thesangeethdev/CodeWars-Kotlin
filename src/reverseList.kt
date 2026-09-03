import jdk.internal.classfile.components.ClassPrinter


fun main() {

    val head = listOf(0,1,2,3)
    val newList = mutableListOf<Int>()

    println(head.reversed())
    for (i in head){
        newList.add(0, i)
    }
    println(newList)
}