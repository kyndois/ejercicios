package examen1t

fun main(){
    var entrada = readln()
    while(entrada != "0 0"){
        val soldiers = mutableListOf<Int>()
        for (i in 1..entrada.split(" ")[0].toInt()){
            soldiers.add(i)
        }
        val jumpSolider= entrada.split(" ")[1].toInt()
        var actualSoldier = 0
        while (soldiers.size != 1){
            actualSoldier = (actualSoldier+jumpSolider)%soldiers.size
            soldiers.removeAt(actualSoldier)
        }
        println(soldiers[0])
        entrada = readln()
    }
}