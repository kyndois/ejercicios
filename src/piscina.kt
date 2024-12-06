fun main() {
//    val size = readln()
//    val pool = mutableListOf<CharArray>()
//    for(i in 0 ..< size[0].digitToInt()){
//        val newRow = readln()
//        val row = CharArray(size[size.length-1].digitToInt())
//        for(f in row.indices){
//            row[f] = newRow[f]
//        }
//        pool.add(row)
//    }
//    val dropBall = readln()

    val size = "5 5"
    val pool = listOf(
        charArrayOf('A', 'A', 'A', 'A', 'A'),
        charArrayOf('A', 'A', 'A', 'T', 'A'),
        charArrayOf('T', 'T', 'T', 'T', 'T'),
        charArrayOf('A', 'T', 'A', 'A', 'A'),
        charArrayOf('A', 'T', 'A', 'A', 'A')
    )
    val dropRow = 4
    val dropCol = 4

    fun mismaPiscina(row: Int, col: Int):Boolean{
        for (i in row .. dropRow){
            if(pool[i][col]=='T') return false
            for(j in col .. dropCol){
                if(pool[i][j]=='T') return false
            }
        }
        for (i in row downTo dropRow){
            if(pool[i][col]=='T') return false
            for(j in col .. dropCol){
                if(pool[i][j]=='T') return false
            }
        }

        return true
    }

    fun contaminar(row: Int) {
        if (row !in pool.indices) return
        for (col in 0..<pool[0].size){
            if(mismaPiscina(row, col)){
                pool[row][col] = 'R'

            }
            contaminar(row+1)
        }
    }

    contaminar(0)
    for (p in pool) {
        for (letter in p) {
            print(letter)
        }
        println()
    }
}