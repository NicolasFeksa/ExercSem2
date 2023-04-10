fun main() {
    val numeros = intArrayOf(10,34,55,76,12,32,54,2,1)
    var maior= numeros[0]
    for ( i in 1 until numeros.size) {
        if (numeros[i] > maior){
            maior = numeros[i]
        }
    }
    println("O maior número é $maior")
    print("\n")
    //2
   val array = IntArray(10)
   for(i in array.indices) {
       print("Digite o ${i+1}º número: ")
       array[i] = readln().toInt()
   }
    val media = array.average()
    print("A média é $media")
    print("\n")

    //3
    val frutas = arrayOf("maçã", "Banana", "Uva", "Bergamota", "Laranja","Abacaxi", "Tomate", "Pera", "Abacate", "Kiwi")
    val frutasComA = ArrayList<String>()
    for (fruta in frutas) {
        if(fruta.startsWith('A', true)){
            frutasComA.add(fruta)
    }
}
    print(frutasComA.joinToString())
}