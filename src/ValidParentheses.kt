//Given a string s containing just the characters
// '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.


fun isValid(s: String): Boolean {

    val stack = mutableListOf<Char>()

    for (char in s) {
        when(char){
            '(', '[', '{' -> stack.add(char) // [ '(', '[' ]


            ')' -> if (stack.isEmpty() || stack.removeAt(stack.size-1) != '(') return false
            ']' -> if (stack.isEmpty() || stack.removeAt(stack.size-1) != '[') return false
            '}' -> if (stack.isEmpty() || stack.removeAt(stack.size-1) != '{') return false

        }
    }
    return stack.isEmpty()
}

fun main() {
    println(isValid("([])"))

//    var s="asdf"
//    for (i in s.indices){
//        println(i)
//    }
//    println(i in s.indices)


}