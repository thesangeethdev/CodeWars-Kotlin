fun main() {

    val primeNumber = 1
    var isPrime = true
    var count = 0

    if (primeNumber == 1){
        isPrime = false
    }
    for (i in 1..primeNumber){
        if (primeNumber % i == 0){
            count+=1
        }
    }
    if (count>2){
        isPrime = false
    }
    println(isPrime)
}