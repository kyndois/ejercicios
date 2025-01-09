package medio// PREGUNTA 17 - K FUNCIONES SENCILLAS

fun main() {
    println(mulRusa(105,1))
    println(mulRusa(1,105))
    println(mulRusa(1999,33))
    println(mulRusa(210,10000))
    println(mulRusa(105,68))
}

fun mulRusa(num1: Int, num2: Int): Int {
    if(num2 == 1) return num1           // Si el segundo número es 1, será la única coincidencia
    var result = 0                      // Variable para gestionar rel resultado e ir sumando
    var newNum1 = num1                  // Recogerá el Número 1 e irá cambiado con la multiplicación
    var newNum2 = num2                  // Recogerá el Número 2 e irá cambiado con la división
    while (newNum2 != 0){               // Mientras el resto no sea 0 durará el bucle
        if (newNum2 % 2 != 0){          // Si [newNum2] es impar
            result += newNum1           // Suma [newNum1] al resultado
        }
        newNum1 *= 2                    // Se multiplica [newNum1] * 2
        newNum2 /= 2                    // Se divide [newNum2] / 2
    }
    return result                       // Se devuelve el resultado
}