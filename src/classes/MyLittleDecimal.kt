package classes

fun main(){
    /*var mld1 = MyLittleDecimal("200,22")
    var mld2 = MyLittleDecimal("10,11")
    var mld3=mld1.sumar(mld2);
    println("$mld1 $mld2 $mld3")
    println(mld3)
    mld1 = MyLittleDecimal("5000,05")
    mld2 = MyLittleDecimal("2,00")
    mld3=mld1.multiplicar(mld2)
    println(mld3)
    mld1 = MyLittleDecimal("100,00")
    mld2 = MyLittleDecimal("300,00")
    mld3=mld1.dividir(mld2)
    println(mld3)
    println()*/
    var mld1 = MyLittleDecimal("-200,22")
    var mld2 = MyLittleDecimal("10,11")
    var mld3=mld1.sumar(mld2)
    //println(""+mld1.valor+" "+mld2.valor+" "+mld3.valor)
    println(mld3)
    mld1 = MyLittleDecimal("-200,22")
    mld2 = MyLittleDecimal("10,11")
    mld3=mld1.restar(mld2)
    println(mld3)
    mld1 = MyLittleDecimal("-1,00")
    mld2 = MyLittleDecimal("3,00")
    mld3=mld1.multiplicar(mld2)
    println(mld3)
    mld1 = MyLittleDecimal("-1,00")
    mld2 = MyLittleDecimal("-3,00")
    mld3=mld1.multiplicar(mld2)
    println(mld3)
}

class MyLittleDecimal() {
    private var valor: Int = 0

    constructor(valor: String) : this() {
        this.valor = valor.replace(",", "").toInt()
    }


    override fun toString(): String {
        val entero = valor / 100
        val decimales = String.format("%02d", valor % 100)
        return "$entero,$decimales"
    }

    fun sumar(otro: MyLittleDecimal): MyLittleDecimal {
        val resultado = valor + otro.valor
        return MyLittleDecimal(String.format("%d,%02d", resultado / 100, resultado % 100))
    }

    fun restar(otro: MyLittleDecimal): MyLittleDecimal {
        val resultado = valor - otro.valor
        return MyLittleDecimal(String.format("%d,%02d", resultado / 100, resultado % 100))
    }

    fun multiplicar(otro: MyLittleDecimal): MyLittleDecimal {
        val resultado = (valor * otro.valor) / 100
        return MyLittleDecimal(String.format("%d,%02d", resultado / 100, resultado % 100))
    }

    fun dividir(otro: MyLittleDecimal): MyLittleDecimal {
        val resultado = (valor * 100) / otro.valor
        return MyLittleDecimal(String.format("%d,%02d", resultado / 100, resultado % 100))
    }


}
