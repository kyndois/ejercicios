package recursividad

fun main(){
    println(""+ mcd(20,10) +", "+ mcd(20,8) +", "+ mcd(20,6) +", "+ mcd(72,16))
}
fun mcd(num1: Int, num2: Int):Int {
    if(num1%num2 == 0) return num2              // Si el [num2] es el mcd
    return mcd(num2, num1%num2)           // Vuelve a llamar a la función, esta vez con [num2] como el resto obtenido
}