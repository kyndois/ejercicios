package tareas.ahorcado

fun main() {
    val frutas = arrayOf(
        "manzana", "pera", "banana", "uva", "naranja",
        "fresa", "kiwi", "melón", "sandía", "piña",
        "mango", "papaya", "cereza", "ciruela", "higo",
        "arándano", "frambuesa", "grosella", "limón", "maracuyá"
    )
    var numIntentos = 1
    var acierto = false
    var letraCorrecta = false
    //val rm = ReproductorMidi("pugnodollari.mid")
    val palabra = frutas[(0..19).random()].uppercase()
    var aciertos = Array(palabra.length) { '_' }
    println("Cargando juego...")
    Thread.sleep(2000)

    while (numIntentos < 7 || acierto) {
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
        }
        DibujoAhorcado.dibujar(numIntentos)
        for(c in aciertos){
            print(c)
        }

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