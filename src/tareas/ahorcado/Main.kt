package tareas.ahorcado

fun main() {
    val frutas = arrayOf(
        "manzana", "pera", "banana", "uva", "naranja",
        "fresa", "kiwi", "melon", "sandia", "piña",
        "mango", "papaya", "cereza", "ciruela", "higo",
        "arandano", "frambuesa", "grosella", "limon", "maracuya"
    )
    var numIntentos = 1
    var acierto = false
    var letraCorrecta = false
    val rm = ReproductorMidi("pugnodollari.mid")
    val palabra = frutas[(0..19).random()].uppercase()
    var aciertos = Array(palabra.length) { '_' }
    println("Cargando juego...")
    Thread.sleep(2000)

    while (numIntentos < 7 && !acierto) {
        println("Introduzca una letra:")
        val entrada = readln().first().uppercaseChar()
        if (entrada in palabra) {
            letraCorrecta = true
            for (c in aciertos.indices) {
                if (palabra[c] == entrada) {
                    aciertos[c] = entrada.uppercaseChar()
                }
            }
        } else {
            letraCorrecta = false
        }
        if (!letraCorrecta) {
            numIntentos++
            print(DibujoAhorcado.RED_BACKGROUND)
            print("**ERROR**")
            println(DibujoAhorcado.RESET)
        }
        DibujoAhorcado.dibujar(numIntentos)
        for(c in aciertos){
            print(DibujoAhorcado.GREEN)
            print(c)

        }
        println(DibujoAhorcado.RESET)
        for (c in aciertos.indices) {
            if (aciertos[c] == '_') {
                break
            }
            if (c == aciertos.lastIndex) {
                acierto = true
            }
        }
    }

    if (acierto) {
        println("HAS GANADO!")
    } else {
        println("HAS PERDIDO!")
        println("La palabra era: $palabra")
    }


}