/*
ENTRADA: Consiste en una serie de compases.
"FIN" indica que no hay que procesar más compases.
Cada  compás es descrito en una linea como una secuencia de notas:
Redonda(R), Blanca(B), Negra(N), Corchea(C) o Semi corchea(S)
separadas entre sí por uno o muchos espacios en blanco.
 */
fun main() {
    var line = readln().trim()
    while (line != "FIN"){
        var total = 0.0
        for (letter in line){
            total+= getValue(letter)
        }
        getResult(total)
        line = readln()
    }

}

/*
una redonda equivale a cuatro negras
una blanca equivale a dos negras
dos corcheas son una negra
dos semicorcheas son una corchea
*/
fun getValue(value: Char): Double {
    when (value) {
        'N' -> return 1.0
        'B' -> return 2.0
        'R' -> return 4.0
        'C' -> return 0.5
        'S' -> return 0.25
    }
    return 0.0
}

/*
CORRECTO si el compas contiene 4 negras o equivalente.
EXCESO si el compas contiene  un tiempo total superior a 4 negras o equivalente.
DEFECTO si el compas contiene un tiempo total inferior a 4 negras o equivalente.
 */
fun getResult(value: Double){
    when{
        (value>4.0) ->  println("EXCESO")
        (value==4.0) ->  println("CORRECTO")
        (value<4.0) ->  println("DEFECTO")
    }
}