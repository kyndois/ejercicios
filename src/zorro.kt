import kotlin.math.abs

fun main() {
    zorro(-4, "@")
}

fun zorro(height: Int, char: String) {
    for (i in 1..abs(height)) {
        if (i == 1 || i == abs(height)) {
            repeat(abs(height)) {
                print("$char")
            }
            println()
        } else {
            if (height < 0) {
                repeat(i - 1) {
                    print(" ")
                }
            }else{
                repeat(height - i) {
                    print(" ")
                }
            }
            print("$char")
            println()
        }

    }
}