

fun main() {
    //Recorrer una lista de strings
    val paises = arrayOf("Colombia", "Canada", "Bolivia", "Argentina \n")

    println("La lista de paises es: ")
    for (i in paises.indices) {
        println(paises[i])
    }


        val list: List<String> = listOf("One", "Two", "Three")

        println(list.asReversed().toString())
    }


    /*val lista: ListOf<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    for (i in lista) {
        println(lista)

    }*/
}

