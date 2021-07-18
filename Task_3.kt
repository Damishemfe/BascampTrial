import java.util.*

fun main() {
    val array = IntArray(5)
    val scan = Scanner(System.`in`)
     print("Enter the Array Elements: ")
        for (i in 0..4) {
            array[i] = scan.nextInt()
        }
        //loop through the numbers one by one
        for (i in array.indices) {
            var isPrime = true

            //check to see if the numbers are prime
            for (j in 2..i) {
                if (i % j == 0) {
                    isPrime = false
                    break
                }
            }
            //print the number
            if (isPrime) print("$i, is a prime no. ")
        }
}