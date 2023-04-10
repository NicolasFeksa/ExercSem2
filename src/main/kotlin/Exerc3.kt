fun main() {
    //1
    val e = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for(i in e) {
        println("$i")
    }
    print(" \n  \n")
//2
    val r = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    for (y in e)
        if(y % 2 == 0)
            print("$y")
print(" \n  \n")
    //3
    val q = arrayOf(1,2,3,4,5,6,7,8,9,10)
    for(j in q)
        if(j % 2 != 0)
            print("$j")

}