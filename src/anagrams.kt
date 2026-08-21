fun main(){

    val str1 = "pp"
    val str2 = "oo"

    val hashMap1 = HashMap<Char, Int>()
    val hashMap2 = HashMap<Char, Int>()

    for (i in str1.toCharArray()){
        if (hashMap1[i] == null){
            hashMap1[i] = 0
        }
        hashMap1[i] = hashMap1[i]?.plus(1) ?: 0
    }

    for (i in str2.toCharArray()){
        if (hashMap2[i] == null){
            hashMap2[i] = 0
        }
        hashMap2[i] = hashMap2[i]?.plus(1) ?: 0
    }

    println(hashMap1)
    println(hashMap2)

    if (hashMap1 == hashMap2){
        println(true)
    }else{
        println(false)
    }
}
