package highorder

fun invertir(map: Map<String,String>):Map<String,String> {
    return map.map { it.value to it.key }.toMap()
}

fun main() {
    // Mapa inicial con códigos de producto como claves y nombres como valores
    val miMapa = mapOf(
        "P001" to "Laptop",
        "P002" to "Smartphone",
        "P003" to "Tablet",
        "P004" to "Headphones"
    )

    // Crear un mapa simétrico para buscar por nombre de producto
    val mapaInverso =  invertir(miMapa)

    println(mapaInverso["Tablet"] + "  "+  mapaInverso["Laptop"])

}