//fun generate(numRows: Int): List<List<Int>> {
//
//
//}

fun main() {

    val numRows = 5
    var finalList = mutableListOf<MutableList<Int>>()
    var count = 0

    for (i in 1..numRows){
//        if (i == 1){
//            finalList.add(listOf(i))
//        }
//        if (i == 2){
//            finalList.add(listOf(1,1))
//        }
//        finalList.add(listOf(1, i+i, 1))

    }
//     val final = (1..numRows).map {
//         listOf(it)
//
//     }

    for (i in 0 until numRows){ //0,1,2,3, 4

        val currentRow = mutableListOf<Int>()

        for (j in 0..i){//0, [0,1], [0,1,2], [0,1,2,3], [0,1,2,3,4]

            if (j == 0 || j == i){

                currentRow.add(1)//1, [1,1], [1, 2, 1], [1,3,3,1], [1,4,6,4,1]

            }

            else{
                val aboveRow= finalList[i-1] //na,na, 1, 2, 2, 3, 3, 3

                val value = aboveRow[j-1] + aboveRow[j]// 1[0] + 1[1] = 1+1, // 2[0] + 2[1]= 1+2 = 2, // 2[1]+2[2] = 2, // 3[0]+3[1]= 4// 3[1]+3[2] = 6// 3[2] + 3[3] = 4

                currentRow.add(value)// 2, 3, 4, 6, 4
            }

        }

        finalList.add(currentRow)//1, [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1]

    }

    println(finalList)
    val arr = intArrayOf(3, 7, 2, 9, 1)
//    arr.sortDescending()
//    println(arr[0])

    var maxSoFar = arr[0]
    for (num in arr){
        if (num>maxSoFar){
            maxSoFar = num
        }
    }
    println(maxSoFar)



}
