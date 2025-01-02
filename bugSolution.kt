fun main() {
    val list: List<Int>? = null
    val doubledList = list?.map { it * 2 } ?: emptyList()
    println(doubledList) // Prints []

    val list2 = listOf(1,2,3,4,5)
    val doubledList2 = list2.map {it *2}
    println(doubledList2) //Prints [2, 4, 6, 8, 10]
} 