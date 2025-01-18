package tareas.ahorcado

internal object DibujoAhorcado {
    val RED_BACKGROUND = "\u001B[41m"
    val YELLOW_BACKGROUND = "\u001B[43m"
    val GREEN = "\u001B[32m"
    val RED = "\u001B[31m"
    val YELLOW = "\u001B[33m"
    val RESET = "\u001B[0m"
    val PURPLE = "\u001B[35m"
    val WHITE_BACKGROUND = "\u001B[47m"

    fun dibujar(i: Int) {
        when (i) {
            1 -> {
                println(" ---------------------")
                var j = 0
                while (j < 15) {
                    println(" |")

                    j++
                }
                println("__________")
            }

            2 -> {
                println(" ---------------------")
                println(" |                     |")
                println(" |                     |")
                println(" |                  -------")
                println(" |                 | -  -  |")
                println(" |                 |   o   |")
                println(" |                  -------")
                var j = 0
                while (j < 10) {
                    println(" |")

                    j++
                }
                println("__________")
            }

            3 -> {
                println(" ---------------------")
                println(" |                     |")
                println(" |                     |")
                println(" |                  -------")
                println(" |                 | -  -  |")
                println(" |                 |   o   |")
                println(" |                  -------")
                println(" |                     |   ")
                println(" |                     |   ")
                println(" |                     |   ")
                println(" |                     |   ")
                println(" |                     |   ")
                var j = 0
                while (j < 5) {
                    println(" |")

                    j++
                }
                println("__________")
            }

            4 -> {
                println(" ---------------------")
                println(" |                     |")
                println(" |                     |")
                println(" |                  -------")
                println(" |                 | -  -  |")
                println(" |                 |   o   |")
                println(" |                  -------")
                println(" |                     |   ")
                println(" |                   / |   ")
                println(" |                 /   |   ")
                println(" |                /    |   ")
                println(" |                     |   ")
                var j = 0
                while (j < 5) {
                    println(" |")

                    j++
                }
                println("__________")
            }

            5 -> {
                println(" ---------------------")
                println(" |                     |")
                println(" |                     |")
                println(" |                  -------")
                println(" |                 | -  -  |")
                println(" |                 |   o   |")
                println(" |                  -------")
                println(" |                     |   ")
                println(" |                   / | \\ ")
                println(" |                  /  |   \\ ")
                println(" |                 /   |     \\ ")
                println(" |                     |   ")
                var j = 0
                while (j < 5) {
                    println(" |")

                    j++
                }
                println("__________")
            }

            6 -> {
                println(YELLOW)
                println(" ---------------------")
                println(" |                     |")
                println(" |                     |")
                println(" |                  -------")
                println(" |                 | -  -  |")
                println(" |                 |   o   |")
                println(" |                  -------")
                println(" |                     |   ")
                println(" |                   / | \\ ")
                println(" |                  /  |   \\ ")
                println(" |                 /   |     \\ ")
                println(" |                     |   ")
                println(" |                    /  ")
                println(" |                   /      ")
                println(" |                  /       ")
                var j = 0
                while (j < 2) {
                    println(" |")

                    j++
                }
                println("__________")
                println(RESET)
            }

            7 -> {
                println(RED)
                println(" ---------------------")
                println(" |                     |")
                println(" |                     |")
                println(" |                  -------")
                println(" |                 | X  X  |")
                println(" |                 |   o   |")
                println(" |                  -------")
                println(" |                     |   ")
                println(" |                   / | \\ ")
                println(" |                  /  |   \\ ")
                println(" |                 /   |     \\ ")
                println(" |                     |   ")
                println(" |                    / \\")
                println(" |                   /   \\  ")
                println(" |                  /     \\ ")
                var j = 0
                while (j < 2) {
                    println(" |")

                    j++
                }
                println("__________")
                println(RESET)
            }
        }
    }
}