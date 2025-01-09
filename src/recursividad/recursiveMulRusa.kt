package recursividad// PREGUNTA 1 - K Ejercicios sencillos con recursividad

fun main(){
    println(mulRusa2(105,1))
    result = 0
    println(mulRusa2(1,105))
    result = 0
    println(mulRusa2(1999,33))
    result = 0
    println(mulRusa2(210,10000))
    result = 0
    println(mulRusa2(105,68))
}
var result = 0
//-------->> LA FUNCIÓN TIENE un "2" EN EL NOMBRE PARA NO HACER CONFLICTO CON EL OTRO EJERCICIO <<--------
fun mulRusa2(num1: Int, num2: Int):Int{
    if(num2 % 2 != 0){                          // Si [num2] es impar
        result += num1                          // Se suma [num1] a la variable global
    }
    if(num2/2 != 0){                            // Si [num2] es divisible entre 2
        mulRusa2(num1*2, num2/2)    // Se vuelve a llamar a la función multiplicando [num1]*2 y dividiendo [num2]/2
    }
    return result                               // Se devuelve el resultado
}