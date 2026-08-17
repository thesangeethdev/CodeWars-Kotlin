//Write a method, fizzBuzz, that takes in a number n as an argument.
// The method should return a list containing numbers from 1 to n,
// replacing certain numbers according to the following rules:
//
//if the number is divisible by 3, make the element "fizz"
//if the number is divisible by 5, make the element "buzz"
//if the number is divisible by 3 and 5, make the element "fizzbuzz"

fun main() {

    val fizzBuzz = 11
    val list = mutableListOf<Any>()

    for (i in 1..fizzBuzz){
        if (i % 3 == 0 && i % 5 == 0){
            list.add("fizzbuzz")
        }
        else if (i % 3 == 0){
            list.add("fizz")
        }else if (i%5 == 0){
            list.add("buzz")
        }else{
            list.add(i)
        }

    }

    println(list)
}