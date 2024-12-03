import kotlin.math.abs

fun main() {
    zorro(-8, "@")
}

fun zorro(height: Int, char: String) {
    for (i in 1..(abs(height))) {
        if (i == 1 || i == (abs(height))) {
            repeat(abs(height)-2) {
                print(char)
            }
            println()
        } else {
            if (height < 0) {
                repeat(i - 2) {
                    print(" ")
                }
            }else{
                repeat((height-1) - i) {
                    print(" ")
                }
            }
            print(char)
            println()
        }

    }
}