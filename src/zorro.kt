import kotlin.math.abs

fun main() {
    zorro(-5, "@")
}

fun zorro(height: Int, char: String) {
    for (i in 1..(abs(height))) {                     //Repetimos las veces convirtiendo el negativo en positivo
        if (i == 1 || i == (abs(height))) {                 //Check si es la primera o la última linea
            repeat(abs(height) - 2) {                 //Se repite el caracter X veces (altura-2)
                print(char)
            }
            println()
        } else {
            if (height < 0) {                               //Check si la altura introducida es negativa
                repeat(i - 2) {                       //Repetimos el espacio tantas veces como i-2 sea
                    print(" ")                              //(si estamos en la segunda linea será 0, en la tercera 1...)
                }
            } else {                                        //Si es positivo
                repeat((height - 1) - i) {            //Repetimos el espacio tantas veces como altura-1-i sea
                    print(" ")                              //(controlamos que si estamos en la segunda linea haya tantos espacios hasta
                }                                           //que falten 3 caracteres para llegar a height-2 que es donde debe ir el caracter
            }
            print(char)                                     //Despues de imprimir (o no) los espacios, imprime el caracter
            println()
        }

    }
}