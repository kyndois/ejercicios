package tareas.buclesFuncionales

fun main(){

    val resultados = generateSequence {
        val entrada = readln().split(":").map { it.toInt() }
        if(entrada.sum() != 0){
            ((23-entrada.first())*60)+(60-entrada.last())
        }else null
    }
    resultados.forEach { println(it) }

}