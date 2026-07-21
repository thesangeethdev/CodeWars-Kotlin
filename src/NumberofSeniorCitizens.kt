fun countSeniors(details: Array<String>) : Int{

    var count = 0
    for (i in details){
        var age = i.substring(11, 13).toInt()

        if (age > 60){
            count += 1
        }
    }
    return count
}

fun main() {

    println(countSeniors(arrayOf("7868190130M7522","5303914400F9211","9273338290F4010")))
}