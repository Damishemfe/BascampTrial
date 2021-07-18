
    fun getOccurence(n: Int, d: Int): Int {

        // Initialize result
        var result = 0

        // Count appearances in numbers
        // starting from d.
        var itr = d
        while (itr <= n) {

            // When the last digit is
            // equal to d
            if (itr % 10 == d) result++

            // When the first digit is
            // equal to d then
            if (itr != 0 && itr / 10 == d) {

                // increment result as
                // well as number
                result++
                itr++
            } else if (itr / 10 == d - 1) itr += (10 - d) else itr += 10
        }
        return result
    }

    // Driver code

    fun main() {
        val n = 50
        val d = 2
        println(getOccurence(n, d))
    }
