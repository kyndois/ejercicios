package backtraking/*Entrada: Una serie de casos. Cada caso es una única línea que contiene cuatro enteros que indican el
número de plantas,
número de habitaciones por planta y
la planta y habitación donde se encuentra la rata.  Las plantas y habitaciones comienzan a numerarse desde 1.

Salida: para cada caso, plano de la casa en la que se observa como los gatos rodean a la rata en las celdas adyacentes.
Ten encuentra que puede haber hasta 8 celdas adyacentes y que solo se representan los gatos que están en las habitaciones adyacentes.
Cada plano se separa del siguiente por una línea en blanco.  Cada habitación se imprime entre []*/

fun main(){
    var attempt = readlnOrNull()
    while (attempt!=null){
        val listChar = attempt.split(" ")
        gyr(listChar[0].toInt(),listChar[1].toInt(),listChar[2].toInt(),listChar[3].toInt())
        attempt = readlnOrNull()
    }
}

fun gyr(flats: Int, rooms: Int, ratFlat: Int, ratRoom: Int){
    var house = mutableListOf<List<String>>()
    for(f in 1..flats){
        var roomsState = mutableListOf<String>()
        for(r in 1 .. rooms){
            if(f == ratFlat && r == ratRoom){
                roomsState.add("R")
            }else if (ratFlat-f !in -1 .. 1 || ratRoom-r !in -1 .. 1){
                roomsState.add("X")
            }else{
                roomsState.add("G")
            }
        }
        house.add(roomsState.toList())
    }

    for (f in house){
        for (i in f){
            print("[$i]")
        }
        println()
    }
}