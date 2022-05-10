import java.util.Scanner

fun main() {
    println("Ingresa el valor de tu nota final: ")

    val sc = Scanner(System.`in`)
    val nota= sc.nextInt()

    if (nota >= 3 ) {
        println("Ganaste el curso de algoritmos")
    } else {
        println("Debes reforzar el curso de algoritmos")
    }
}