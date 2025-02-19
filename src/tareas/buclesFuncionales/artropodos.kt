package tareas.buclesFuncionales

fun main() {
    val numeroCasos = readln().toInt()
    val resultados = (1..numeroCasos).map {
        val numero = readln().split(" ")
        val numeroPatasInsectos = numero.first().toInt() * 6
        val numeroPatasAracnidos = numero[1].toInt() * 8
        val numeroPatasCrustaceos = numero[2].toInt() * 10
        val numeroPatasEscolopendras = (numero.last().toInt() * numero[3].toInt()) * 2
        (numeroPatasInsectos + numeroPatasAracnidos + numeroPatasCrustaceos + numeroPatasEscolopendras)
    }

    resultados.forEach { println(it) }

}