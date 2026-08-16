import kotlin.math.sqrt

fun main() {

    val primeNumber = 713
    var isPrime = true
    var count = 0

    if (primeNumber == 1){
        isPrime = false
    }
    for (i in 2..sqrt(primeNumber.toDouble()).toInt()){
        if (primeNumber % i == 0){
            isPrime = false
        }
    }
//    if (count>2){
//        isPrime = false
//    }
    println(isPrime)
}