fun main() {
    //1
    print("Digite uma frase")
    var frase = readln()
    println("A frase tem ${frase.length} caracteres")
    print("\n \n")
    //2
    var fraseInvertida = ""
    frase = frase.lowercase()
    for (i in frase.length - 1 downTo 0) {
        fraseInvertida += frase[i]
    }
    println(fraseInvertida.replaceFirstChar { it.uppercase() })
    print("\n")

//3
    var vogal = ""
    for (i in frase.indices) {
        val caractere = frase[1]
        if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u')
            vogal += caractere.uppercase()
    }
    print("$vogal")
}
