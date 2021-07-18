import java.util.*

// Java program to output the maximum occurring character
// in a string

    const val ASCII_SIZE = 256
    fun getMaxOccuringChar(str: String): Char {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        val count = IntArray(ASCII_SIZE)

        // Construct character count array from the input
        // string.
        val len = str.length
        for (i in 0 until len) count[str[i].toInt()]++
        var max = -1 // Initialize max count
        var result = ' ' // Initialize result

        // Traversing through the string and maintaining
        // the count of each character
        for (i in 0 until len) {
            if (max < count[str[i].toInt()]) {
                max = count[str[i].toInt()]
                result = str[i]
            }
        }
        return result
    }

    // Driver Method
    fun main() {
        val scan = Scanner(System.`in`)
        print("Enter String: ")


        val str = scan.nextLine()
        println(
            "Max occurring character is " +
                    getMaxOccuringChar(str)
        )
    }