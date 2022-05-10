import java.util.Scanner

fun main() {
    println("ESCALA SISMOLÓGICA DE RICHTER \n Ingresa un valor entre 1.0 y 10.0 para conocer la magnitud del sismo:")
    val sc = Scanner(System.`in`)
    val magnitud = sc.nextFloat()

    when (magnitud) {
      in 1.0..1.9 -> println("Micro - Los microsismos no son perceptibles.")
      in 2.0..3.9 -> println("Menor - Perceptibles a menudo, pero rara vez provocan daños.")
      in 4.0..4.9 -> println("Ligero - Sismo significativo pero con da;o poco probable.")
      in 5.0..5.9 -> println("Moderado - Puede causar daños mayores en edificaciones débiles o mal construidas. ")
      in 6.0..6.9 -> println("Fuerte - Pueden llegar a destruir áreas pobladas, en hasta unos 160 kilómetros a la redonda.")
      in 7.0..7.9 -> println("Mayor - Puede causar serios daños en extensas zonas.")
      in 8.0..9.9 -> println("Épico o Cataclismo - Devastadores en zonas de varios miles de kilómetros.")
      in 10.0..Float.MAX_VALUE.toDouble() -> println("Legendario o apocalíptico - Nunca registrado.")

    }
}