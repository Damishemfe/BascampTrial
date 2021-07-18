import java.util.*

//MAIN FUNCTION
fun main() {
    //Creating a new scanner object to collect input
    val scan = Scanner(System.`in`)
    print("Enter number: ")
    val number = scan.nextInt()

    //Final result
    println(prime(number))
}

//PRIME FUNCTION
fun prime(number: Int):Boolean {


    //Loop to Determine Prime number
    for (i in 2..number / 2) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}