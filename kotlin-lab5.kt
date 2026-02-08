
fun factorialIterative(number: Int): Int {
    if (number < 0) return 0

    var accumulator = 1
    for (i in 1..number) {
        accumulator *= i
    }
    return accumulator
}

fun factorialRecursive(number: Int): Int {
    if (number < 0) return 0
    if (number <= 1) return 1

    return factorialRecursive(number - 1) * number
}

fun factorialTrace(number: Int): Int {
    println("Appel de factorialTrace($number)")

    if (number <= 1) {
        println("Base case atteint pour $number, retour 1")
        return 1
    }

    val result = factorialTrace(number - 1) * number
    println("Retour de factorialTrace($number) = $result")
    return result
}

fun sumTo(n: Int): Int {
    if (n <= 1) return n
    return sumTo(n - 1) + n
}

fun power(base: Int, exponent: Int): Int {
    if (exponent == 0) return 1
    return base * power(base, exponent - 1)
}

fun main() {
    println("Lab récursion – Factorielle\n")

    println("=== Version itérative ===")
    println("factorialIterative(5) = ${factorialIterative(5)}")

    println("\n=== Version récursive ===")
    println("factorialRecursive(5) = ${factorialRecursive(5)}")

    println("\n=== Trace récursive ===")
    val result = factorialTrace(4)
    println("Résultat final = $result")

    println("\n=== Extensions ===")
    println("sumTo(5) = ${sumTo(5)}")
    println("power(2, 4) = ${power(2, 4)}")
}
