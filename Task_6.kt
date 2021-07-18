
    fun printpairs(arr: IntArray, sum: Int) {
        val s = HashSet<Int>()
        for (i in arr.indices) {
            val temp = sum - arr[i]

            // checking for condition
            if (s.contains(temp)) {
                println(
                    "Pair with given sum "
                            + sum + " is (" + arr[i]
                            + ", " + temp + ")"
                )
            }
            s.add(arr[i])
        }
    }

    // Driver Code
    fun main() {
        val arry = intArrayOf(1, 10, 45, 6, 10, 8)
        val num = 20
        printpairs(arry, num)
    }
