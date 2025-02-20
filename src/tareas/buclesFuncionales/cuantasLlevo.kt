package tareas.buclesFuncionales

fun main(){
    val resultados = generateSequence {
        val entrada = readln()
        if(entrada != "0 0"){
            val num1 = entrada.split(" ").first().map { it }.reversed()
            val num2 = entrada.split(" ").last().map { it }.reversed()
            var acarreos= 0
            num1.forEachIndexed { index, num ->
                if(index <= num2.lastIndex){
                    if(num .digitToInt()+ num2[index].digitToInt() > 9) acarreos++
                }
            }
            acarreos
        }else null
    }
    resultados.forEach { println(it) }
}