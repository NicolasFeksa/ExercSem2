fun main(){
    //1
    var i = 0
    while (i < 10) {
        if (i == 5) {
            i++
            continue
        }
        println(i)
        i++
    }
//2
   var j: Int
   while(true) {
       print("Digite um número: ")
       j = readln().toInt()
       if(j < 0)
           break

   }
//3
print("Digite o número selecionado")
    val inte = readln().toInt()
    if (inte > 0) {
        for (numero in 0..inte step 2) {if (numero ==4)
            continue
            print ("$numero")
            if( numero >= inte)
                break
    }
    } else {
        println("Número invalido")
    }


}



