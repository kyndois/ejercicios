fun main(){
    /**
     * Recibe una lista de números
     * Realiza las siguientes funciones:
     * -listaNumeros() Devuelve un texto con todos los números separados.
     * -contarNumeros() Devuelve la cantidad de números en la lista.
     * -ultimoImpar() Devuelve el último número impar de la lista.
     * -contarPares() Devuelve el número de pares.
     * -suma() Devuelve la suma de todos los números.
     * -multiplicar() Devuelve el resultado de la multiplicación del primero por el último número.
     * -dividir() Devuelve el resultado de la división del número más grande por el más pequeño.
     * -mayorDiez() Devuelve solo los números que superen el número 10.
     * -divisible() Devuelve true o false si el primer número es divisible entre 3.
     * -media() Devuelve la media de los números introducidos.
     * -masMedia() Devuelve la lista de números que igualen o superen la media.
     * -ultimoImparXPares() Devuelve la multiplicación del último número impar por el número total de pares
     * -nombrePequeno() Devuelve el nombre del número má pequeño de la lista
     */

    /*
    Casos de uso
    3 87 12 45 99 2 67 54 18 76 32 9 51 63 8 25 49 72 15 80
    7 92 5 38 61 84 17 42 95 23 66 59 10 47 81 19 52 87 28 63 98 31 68 13 49 83 21 56 91 16
    92 5 38 61 84 17 42 95 23 66 59 10 47 81 19 52 87 28 63 98 31 68 13 49 83 21 56 91 7 97 4 36 58 82 15 40 93 25 67 60 12 45 89 22 55 88 27 62 96 30
    */
    var stop = false
    while(!stop) {
        var continuar = -1
        val entrada = readln().split(" ")
        val listaNumeros = mutableListOf<Int>()
        for (numero in entrada) {
            listaNumeros.add(numero.toInt())
        }

        salida(listaNumeros)

        while(continuar !in 0..1) {
            println("Introduzca:\n0 - Continuar\n1 - Terminar")
            continuar = readln().toInt()
            if (continuar == 1) {
                stop = true
            }
        }

    }

}
fun salida(listaNumeros: List<Int>) {
    println("Números:")
    println(listaNumeros(listaNumeros))
    println("Cantidad de números:")
    println(contarNumeros(listaNumeros))
    println("El último número impar es:")
    println(ultimoImpar(listaNumeros))
    println("El número total de pares es:")
    println(contarPares(listaNumeros))
    println("La suma de todos los números es:")
    println(suma(listaNumeros))
    println("La multiplicación de el primero por último es:")
    println(multiplicar(listaNumeros))
    println("La división del número mayor entre el menor es:")
    println(dividir(listaNumeros))
    println("Los número mayores a 10 son:")
    println(mayorDiez(listaNumeros))
    println("El primer número és divisible entre 3")
    println(if (divisible(listaNumeros)) "Verdadero" else "Falso")
    println("La media de los número es:")
    println(media(listaNumeros))
    println("Los número que superan la media son:")
    println(masMedia(listaNumeros))
    println("La multiplicación de el ultimo impar por la cantidad de pares es:")
    println(ultimoImparXPares(listaNumeros))
    println("El número más pequeño es el:")
    println(nombrePequeno(listaNumeros))
}
fun listaNumeros(lista: List<Int>) : String{
    var numeros = ""
    for(numero in lista){
        numeros+= "$numero "
    }
    return numeros
}
fun contarNumeros(lista: List<Int>) : Int{
    return lista.size
}
fun ultimoImpar(lista: List<Int>) : Int{
    var ultimo = 0
    for(numero in lista){
        if(numero%2 != 0){
            ultimo = numero
        }
    }
    return ultimo
}
fun contarPares(lista: List<Int>) : Int{
    var total = 0
    for (numero in lista){
        if(numero%2 == 0){
            total++
        }
    }
    return total
}
fun suma(lista: List<Int>) : Int{
    var suma = 0
    for (numero in lista){
        suma+=numero
    }
    return suma
}
fun multiplicar(lista: List<Int>) : Int{
    return lista.first()*lista.last()
}
fun dividir(lista: List<Int>) : Int{
    var mayor = 0
    var menor = 100
    for(numero in lista){
        if(numero<menor) menor = numero
        if(numero>mayor) mayor = numero
    }
    return mayor/menor
}
fun mayorDiez(lista: List<Int>) : String{
    var mayores = ""
    for(numero in lista){
        if(numero>10) mayores+= "$numero "
    }
    return mayores
}
fun divisible(lista: List<Int>) : Boolean{
    return lista[0]%3 == 0
}
fun media(lista: List<Int>) : Int{
    return suma(lista)/lista.size
}
fun masMedia(lista: List<Int>) : List<Int>{
    val superan = mutableListOf<Int>()
    val media = media(lista)
    for (numero in lista){
        if(numero >= media) superan.add(numero)
    }
    return superan
}
fun ultimoImparXPares(lista: List<Int>) : Int{
    return ultimoImpar(lista)*contarPares(lista)
}
fun nombrePequeno(lista: List<Int>) : String{
    val numeros = listOf("Cero","Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve")
    return numeros[lista.minOf { it }]
}