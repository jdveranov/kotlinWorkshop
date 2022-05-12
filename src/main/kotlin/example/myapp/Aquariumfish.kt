package example.myapp

abstract class AquariumFish: FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}

interface FishAction  {
    fun eat()
}


class Shark: AquariumFish() {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus: AquariumFish() {
    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}

interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim()  {
        println("swim")
    }
}
