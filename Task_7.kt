import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

    val numArray = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0, 7.0, 8.0)
    val standardDiv = calculatestandardDiv(numArray)

    System.out.format("Standard Deviation = %.6f", standardDiv)
}

fun calculatestandardDiv(numArray: DoubleArray): Double {
    var sum = 0.0
    var standardDeviation = 0.0

    for (num in numArray) {
        sum += num
    }

    val mean = sum / 10

    for (num in numArray) {
        standardDeviation += (num - mean).pow(2.0)
    }
    return sqrt(standardDeviation / 10)
}