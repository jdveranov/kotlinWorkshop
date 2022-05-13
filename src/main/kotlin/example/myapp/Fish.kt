package example.myapp

data class Fish(var name : String)

fun fishExamples() {
    val fish = Fish("splashy")  // all lowercase
    myWith (fish.name) {
        println(fish.let { it.name.capitalize()}
            .let{it + "fish"}
            .let{it.length}
            .let{it + 31})
        println(fish)}
}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

fun main(){
    fishExamples()
}