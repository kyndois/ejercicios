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
            contagio(fila+1, column)
            contagio(fila-1, column)
            contagio(fila, column+1)
            contagio(fila, column-1)
        }

        for (f in concierto.indices){
            for(t in concierto[f].indices){
                if(concierto[f][t] == 'T'){
                    contagio(f-1,t)
                    contagio(f,t+1)
                    contagio(f+1,t)
                    contagio(f,t-1)
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