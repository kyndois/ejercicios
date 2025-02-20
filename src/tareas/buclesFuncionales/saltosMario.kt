package tareas.buclesFuncionales

fun main() {
    val casos = readln().toInt()
    val resultados = (1..casos).map {
        val muros = readln().toInt()
        val saltosTotales = readln().split(" ").map { it.toInt() }
        var saltosArriba = 0
        var saltosAbajo = 0
        saltosTotales.zipWithNext { a, b ->
            if(b>a){
                saltosArriba++
            }
            if (b<a){
                saltosAbajo++
            }
        }
        "$saltosArriba $saltosAbajo"
    }
    resultados.forEach { println(it) }
}