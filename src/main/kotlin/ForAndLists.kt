

fun main() {
    //Recorrer una lista de strings
    val paises = arrayOf("Colombia", "Canada", "Bolivia", "Argentina \n")

    println("La lista de paises es: ")
    for (i in paises.indices) {
        println(paises[i])
    }

    //Imprimir una lista de atrás para adelante
    val list: List<String> = listOf("One", "Two", "Three")

    println(list.asReversed())

    //Remover un elemento de la lista
    val months = mutableListOf("January", "March", "November")
    months.remove("November")
    println(months)






}

