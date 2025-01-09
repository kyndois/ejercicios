package examen1t

fun main(){
    var entrada = readln()

    while(entrada!="0"){
        val concierto = mutableListOf<CharArray>()
        for (i in 1..entrada.toInt()){
            val line = readln().toCharArray()
            concierto.add(line)
        }

        fun contagio(fila: Int, column: Int){
            if(fila !in concierto.indices) return
            if(column !in concierto[fila].indices) return
            if(concierto[fila][column] != 'S') return
            concierto[fila][column] = 'X'
            contagio(fila, column+1)
            contagio(fila, column-1)
            if(fila-1 in concierto.indices) {
                if (column > concierto[fila - 1].lastIndex) {
                    contagio(fila - 1, concierto[fila - 1].lastIndex)
                } else {
                    contagio(fila - 1, column)
                }
            }
            if(fila+1 in concierto.indices) {
                if (fila + 1 < concierto.size && column > concierto[fila + 1].lastIndex) {
                    contagio(fila + 1, concierto[fila + 1].lastIndex)
                } else {
                    contagio(fila + 1, column)
                }
            }
        }

        for (f in concierto.indices){
            for(t in concierto[f].indices){
                if(concierto[f][t] == 'T'){
                    contagio(f,t+1)
                    contagio(f,t-1)
                    if(f-1 in concierto.indices) {
                        if (t > concierto[f - 1].lastIndex) {
                            contagio(f - 1, concierto[f - 1].lastIndex)
                        } else {
                            contagio(f - 1, t)
                        }
                    }
                    if(f+1 in concierto.indices) {
                        if (t > concierto[f + 1].lastIndex) {
                            contagio(f + 1, concierto[f + 1].lastIndex)
                        } else {
                            contagio(f + 1, t)
                        }
                    }
                }
            }
        }
        for(f in concierto){
            for (i in f){
                print(i)
            }
            println()
        }
        println("---------------")
        entrada = readln()
    }
}