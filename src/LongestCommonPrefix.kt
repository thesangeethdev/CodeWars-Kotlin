fun longestCommonPrefix(strs: Array<String>): String {

    // ab, a return a

    val first = strs[0]
    for (i in first.indices){
        val ch = first[i]
        for (j in 1 until strs.size){
            if (i >= strs[j].length || strs[j][i] != ch){
                return first.substring(0, i)
            }
        }
    }
    return first
}

fun main(){
    println(longestCommonPrefix(arrayOf("flower","flow","flight")))
}