import java.util.*

fun main() {
    //Calling Replaced function in the main function
    replaced()
}

fun replaced() {
    //Creating a new scanner object to collect input
    val scan = Scanner(System.`in`)
    print("Type Text: ")

    //Collecting the Sentence
    var sentence = scan.nextLine()
    println("Original Sentence: $sentence")

    //Replacing the spaces with "%20"
    sentence = sentence.replace("\\s".toRegex(), "%20")
    println("New Sentence: $sentence")
}