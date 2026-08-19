fun main() {

//    val list = mutableListOf("a", "b", "c")
//    val list = mutableListOf("a", "b", "c", "d")
    val list = mutableListOf("cherry", "cranberry", "banana", "blueberry", "lime", "papaya")
    val pairedLst: MutableList<MutableList<String>> = mutableListOf()
    val count = 0
    for (i in list.indices) { //0,1,2
        for (j in i + 1 until list.size) { //1,2
            var pairedListSub: MutableList<String> = mutableListOf()
            pairedListSub.add(list[i]) //[a]
            pairedListSub.add(list[j]) //[a,b]
            pairedLst.add(pairedListSub)
        }
    }

    println(pairedLst)
}