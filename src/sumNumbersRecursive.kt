fun main() {

    sumNumbersRecursive(mutableListOf(5, 2, 9, 10))
}

var sum = 0
fun sumNumbersRecursive(n: List<Int>){

    if (n.isEmpty()) {
        println(sum)
        return
    }

    sum += n.first()
    sumNumbersRecursive(n.drop(1))

}

