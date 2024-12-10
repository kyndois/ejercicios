/**
 * Recibe dos números separados entre 0-9
 * La secuencia debe ser de manera que cada número será la suma de los 2 anteriores
 * Genera un -->ARRAY<-- donde guardar las 10 primeras coincidencias
 * Imprimir la secuencia
 */

fun main(){
    val entrada = readln()
    val numeros = entrada.split(" ")
    fibonnaci(numeros[0].toInt(), numeros[1].toInt())
}

fun fibonnaci(num1: Int, num2: Int){

    val secuencia = Array(10) { 0 }
    secuencia[0] = num1
    secuencia[1] = num2
    for(i in 0..7){
        val resultado = secuencia[i]+secuencia[i+1]
        secuencia[i+2] = resultado
    }
    for(num in secuencia){
        print("[$num] ")
    }
}