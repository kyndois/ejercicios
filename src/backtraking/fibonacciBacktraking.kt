package backtraking

/**
 * Recibe dos números separados entre 0-9
 * La secuencia debe ser de manera que cada número será la suma de los 2 anteriores en horizontal y vertical(siempre coincide)
 * Genera una -->MATRIZ<-- donde guardar las 6-6 primeras coincidencias
 * El calculo de cada resultado se hará de forma recursiva
 * Imprimir la secuencia
 */

fun main(){
    val entrada = readln()
    val numeros = entrada.split(" ")

    val matriz = listOf(
        intArrayOf(0,0,0,0,0,0),
        intArrayOf(0,0,0,0,0,0),
        intArrayOf(0,0,0,0,0,0),
        intArrayOf(0,0,0,0,0,0),
        intArrayOf(0,0,0,0,0,0),
        intArrayOf(0,0,0,0,0,0)
    )
    matriz[0][0] = numeros[0].toInt()
    matriz[0][1] = numeros[1].toInt()
    matriz[1][0] = numeros[1].toInt()
    matriz[1][1] = numeros[1].toInt()

    fun fibonacciBacktraking(row: Int, col: Int){
        if(row !in matriz.indices) return
        if(col !in matriz[0].indices) return
        if(row < 2 && col < 2) matriz[row][col] = matriz[row][col]
        else if(row < 2 ) matriz[row][col] = matriz[row][col-2] + matriz[row][col-1]
        else if(col < 2 ) matriz[row][col] = matriz[row-2][col] + matriz[row-1][col]
        else matriz[row][col] = matriz[row][col-2] + matriz[row][col-1]
        fibonacciBacktraking(row+1, col)
        fibonacciBacktraking(row, col+1)
    }

    fibonacciBacktraking(0,0)

    for(i in matriz){
        for(j in i){
            //Esto solo para que quede bonito
            print("[" + "%03d".format(j) + "] ")
        }
        println()
    }
}

