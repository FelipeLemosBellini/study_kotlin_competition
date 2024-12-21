fun main(){
    val list = listOf(-1,0,1,2,3,4,5)
//
    //
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }

    for (i in 1 until 5 step 2) {
        println(i)
    }
}