/**
 *  BASICOS
 */

fun main(){
    val entrada = readln()
    contarPalabras(entrada)
}

/**
 * Imprime todos los números de 0 a 10
 * Separa los pares de los impares
 */

fun parImpar(){
    val par = mutableListOf<Int>()
    val impar = mutableListOf<Int>()
    for (i in 1..10){
        if(i%2 == 0){
            par.add(i)
        }else{
            impar.add(i)
        }
    }
    print("Números par: ")
    for(numero in par){
        print("$numero ")
    }
    println()
    print("Números par: ")
    for(numero in impar){
        print("$numero ")
    }
}

/**
 * Recibe un string
 * Imprime:
 *  -el número de cuantas palabras hay.
 *  -cada palabra en mayuscula.
 *  -indica que palabra es la más larga y cuantas letras tiene.
 */

fun contarPalabras(text: String){
    val palabras = text.split(" ")
    var masLarga = ""
    println("El número de palabras total es: ${palabras.size}")
    println("Las palabras son:\n")
    for (pal in palabras){
        if(masLarga.length < pal.length) masLarga = pal
        println(pal.uppercase())
    }
    println("La palabra mas larga es: '${masLarga.uppercase()}' con ${masLarga.length} letras.")
}