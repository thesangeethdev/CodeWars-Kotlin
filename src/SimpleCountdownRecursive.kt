fun main() {

    countdown(5)
}

fun countdown(n: Int){

    if (n == 0){
        return
    }
    println(n)
    countdown(n-1)
}