package basicos

/**
 *  BASICOS
 */

fun main(){

    fun ejeParImpar(){
        parImpar()
    }

    fun ejeContarPalabras(){
        val entrada = readln()
        contarPalabras(entrada)
    }

    fun ejeBuscarNombres(){
        val entrada = readln()
        val listaNombres = buscarNombres(entrada[0])
        println("Lista de nombres con la letra '${entrada[0]}'")
        for (nombre in listaNombres){
            println(nombre)
        }
    }
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

/**
 * Recibe un Char con la letra introducida
 * Comprueba que nombres tienen la letra introducida y los devuelve en forma de lista
 * El MAIN debe recuperar la lista devuelta e imprimirla
 */

fun buscarNombres(caracter: Char):List<String>{
    val nombres = listOf(
        "Ana", "María", "Laura", "Sofía", "Lucía",
        "Javier", "David", "Alejandro", "Daniel", "Álvaro",
        "Carmen", "Isabel", "Pilar", "Rosa", "Lola",
        "Antonio", "José",  "Manuel",  "Francisco", "Juan"
    )
    val resultado = mutableListOf<String>()

    for(nom in nombres){
        for(letra in nom){
            if(letra.uppercase() == caracter.uppercase()){
                resultado.add(nom)
                break
            }
        }
    }
    return resultado
}