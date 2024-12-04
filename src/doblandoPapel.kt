fun main() {
    var original = arrayOf(
        charArrayOf('*', ' ', ' '),
        charArrayOf('*', '*', ' '),
        charArrayOf('*', '*', '*')
    )
    imprimirFiguras(original, getSimetrica(original))

    original = arrayOf(
        charArrayOf(' ', '*',' ',' '),
        charArrayOf('*', '*','*','*'),
        charArrayOf(' ', '*',' ',' ')
    )
    imprimirFiguras(original, getSimetrica(original))
    original = arrayOf(
        charArrayOf('*', ' ', ' '),
        charArrayOf('*', '*', ' '),
        charArrayOf('*', ' ', '*'),
        charArrayOf('*', '*', ' '),
        charArrayOf('*', ' ', ' '),
    )
    imprimirFiguras(original, getSimetrica(original))
}

fun imprimirFiguras(original: Array<CharArray>, simetrica: List<CharArray>){
    for (i in original.indices){
        for (o in original[i]){
            print(o)
        }
        for (o in simetrica[i]){
            print(o)
        }
        println()
    }
    println()
}

fun getSimetrica(original: Array<CharArray>):List<CharArray>{
    var simetrica = mutableListOf<CharArray>()
    for (o in original){
        simetrica.add(o.reversed().toCharArray())
    }
    return simetrica.toList()
}