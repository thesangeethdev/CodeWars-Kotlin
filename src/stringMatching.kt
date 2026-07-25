fun stringMatching(words: Array<String>): List<String> {

    val shrtest = mutableListOf<String>()
    for (i in words){
        for (j in words.indices){
            if (i.contains(words[j]) && i != words[j]){
                shrtest.add(words[j])
            }
        }
    }

    return shrtest.distinct()
}
fun main() {

    println(stringMatching(arrayOf("mass","as","hero","superhero")))

}