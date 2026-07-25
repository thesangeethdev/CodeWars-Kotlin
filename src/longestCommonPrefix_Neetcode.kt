// for loop
// have a empty stack of mutable list
// for each work pick first char and add to the list
// second iteration -> secondchar -> if common for all string add to list
// if first iteration if there are no match return emptyString


//fun longestCommonPrefixNeetCode(strs: Array<String>): String {
//
//    var charList=  mutableListOf<Char>()
//    for (i in strs.indices){ // 0
//        for (j in 1 until strs[i].length){ // 1
//            charList.add(strs[i][j]) // b
//        }
//    }
//
//    return charList.toString()
//}

//fun main() {
//
//    println(longestCommonPrefixNeetCode(arrayOf("bat","bag","bank","band")))
//}

fun main() {

//    val strs = arrayOf("bat","bag","bank","band")
    val strs = arrayOf("a","a","a")
    var charList = mutableListOf<Char>()
    var firstString = strs[0]//bat

    for (i in firstString.indices) { // 0
        var firstChar = firstString[i] //b
        for (j in 1 until strs.size) { //

            if (i >= strs[j].length || strs[j][i] != firstChar){
                println(firstString.substring(0,i))
            }

        }
    }
//    println(charList)
}