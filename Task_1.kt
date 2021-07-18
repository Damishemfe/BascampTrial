
import java.util.*

fun main() {
    //Mutable Variables/Base Variables
    var even = 0
    var odd = 0

    //Creating a new scanner object to collect input
    val scan = Scanner(System.`in`)
    print("Enter Size of Array: ")

    //Variable for collecting the Integer
    val num = scan.nextInt()
    val numbers = IntArray(num)
    print("Enter array elements: ")

    //Loop Initializing the Array
    for (i in numbers.indices) {
        numbers[i] = scan.nextInt()
    }

    //Summing and checking of the Even and odd Elements
    for (n in numbers) {
        if (n % 2 == 0) {
            even += n
        } else {
            odd += n
        }
    }

    //Final Result
    println("Sum of Even Numbers:$even")
    println("Sum of Odd Numbers:$odd")
}


