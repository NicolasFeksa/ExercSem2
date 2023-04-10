fun main() {
    //1
    var i = 0
    println("Iniciando")
    do {
            println("$i")
            i++
        } while (i < 10)
        println("encerrou")

    print("\n\n")
    //2
var num: Int
    do {
        print("Digite um número: ")
        num = readln().toInt()
    }while(num > 0)
    println("Parabéns")

    print("\n \n")

    //3

    val sorteado = 4
    var number: Int
    do {
        print("Digite o numero sorteado: ")
           number = readln().toInt()
    } while(number != sorteado)
    println("Parabéns")
}