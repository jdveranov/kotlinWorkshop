//Clase abstracta

abstract class Planet(val id: Int)
class BasicPlanet(id: Int) : Planet(id)
class PlanetWithSatellites(id: Int, val satellitesNames: List<String>) : Planet(id)

fun main() {
    val mercury = BasicPlanet(0)
    val earth = PlanetWithSatellites(2, listOf("Moon"))