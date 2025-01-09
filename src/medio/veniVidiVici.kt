package medio// PREGUNTA 20 - K FUNCIONES SENCILLAS

fun main() {
    println(cesar("Alea iacta est", 3))
    println(cesar("Ave, Caesar, morituri te salutant", 7))
    println(cesar("VW VCODKGP, DTWVQ?", -2))
    println(cesar("a",-1))
    println(cesar("a",-26))
}

fun cesar(txt: String, crypto: Int): String {
    var decrypt = ""
    val alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for (l in txt) {                                                 // Recorremos el texto
        if (l.isLetter()) {                                          // Check si es una letra o no
            val letter = alfabeto.indexOf(l.uppercaseChar())         // Localizamos la posición de la letra en nuestro alfabeto convirtiendo en mayusculas
            var newLetter =(letter + crypto) % 26                    // Creamos la posición de la nueva letra y nos aseguramos que esté
            if (newLetter < 0) {                                     // Check si el resultado es negativo para empezar desde el final
                newLetter += 26                                      // Volvemos a recuperar el valor dentro de los 26 positivos
            }
            decrypt += alfabeto[newLetter]                           // Agregamos a nuestro resultado la letra en la posición obtenida
        } else {
            decrypt += l                                             // Agregamos el caracter sin modificar al resultado
        }
    }
    return decrypt
}