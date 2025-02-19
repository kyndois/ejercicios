package tareas.buclesFuncionales

fun main(){

    val resultados = generateSequence {
        val entrada = readln().split(" ").map{ it.toInt() }
        if(!entrada.any { it<0 }){
            entrada.sumOf { it * 2 }
        }else null
    }

    resultados.forEach { println(it) }

}