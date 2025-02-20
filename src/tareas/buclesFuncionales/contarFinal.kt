package tareas.buclesFuncionales

import java.math.BigInteger
import java.text.DecimalFormat

fun main(){

    val resultados = generateSequence {
        val entrada = readlnOrNull()
        val df = DecimalFormat("#,###")
        if(entrada != null){
            val numero = entrada.replace(".","")
            val bigNumber = BigInteger(numero)
            val suma = bigNumber.add(BigInteger.ONE)
            df.format(suma)
        }else null
    }
    resultados.forEach { println(it) }

}