package SealedClass//Clase abstracta

abstract class PlanetAbs(val id: Int) {
    class BasicPlanet(i: Int) {

    }

    class PlanetWithSatellites(i: Int, listOf: List<String>) {

    }
}

class BasicPlanet(id: Int) : PlanetAbs(id)
class PlanetWithSatellites(id: Int, val satellitesNames: List<String>) : PlanetAbs(id)

fun main() {
    val mercury = BasicPlanet(0)
    val earth = PlanetWithSatellites(2, listOf("Moon"))
}