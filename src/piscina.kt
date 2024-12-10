fun main() {
    var size = readln()
    while(size != "0 0") {
        val pool = mutableListOf<CharArray>()
        repeat (size[0].digitToInt()) {
            val newRow = readln()
            val row = CharArray(size[size.length - 1].digitToInt())
            for (f in row.indices) {
                row[f] = newRow[f]
            }
            pool.add(row)
        }
        val dropBall = readln()

        fun contaminar(row: Int, col: Int) {
            if (row !in pool.indices) return
            if (col !in 0..pool[0].size-1) return
            if (pool[row][col] == 'A') {
                pool[row][col] = 'R'
                contaminar(row + 1, col)
                contaminar(row - 1, col)
                contaminar(row, col + 1)
                contaminar(row, col - 1)
            }

        }

        contaminar(dropBall[0].digitToInt(), dropBall[dropBall.lastIndex].digitToInt())
        for (p in pool) {
            for (letter in p) {
                print(letter)
            }
            println()
        }
        println("---------------------------------------------")
        size = readln()
    }
}