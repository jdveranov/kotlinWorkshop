import java.util.Scanner

fun main() {
    var op: Int= 0
    var aux: Boolean = true
    println (" 1. Sumar \n 2. Restar \n 3. Salir")

    while (aux) {

        println("Digite la opción del menú: ")
        val sc= Scanner(System.`in`)
        op = sc.nextInt()

        when (op) {
            1 -> {
                println("Digite dos valores para sumarlos: ")
                val a = sc.nextInt()
                val b = sc.nextInt()
                val sum = a + b
                println("La suma es $sum")
            }
            2 -> {
                println("Digite dos valores para restarlos: ")
                val c = sc.nextInt()
                val d = sc.nextInt()
                val res = c - d
                println("La resta es $res")
            }
            3 -> {
                aux = false
            }
        }

    }
    println("Hasta pronto!")

}