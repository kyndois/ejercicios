package tareas.buclesFuncionales

fun main(){

    val casos = readln().toInt()
    val resultados =(1..casos).map {
        val titulo = readln().replace(" ","").lowercase()
        val codigo = readln().replace(" ","").lowercase()
        if(codigo.all { it in titulo }) "SI" else "NO"
    }
    resultados.forEach { println(it) }
}