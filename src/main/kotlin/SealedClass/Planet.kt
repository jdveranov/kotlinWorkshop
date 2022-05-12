package SealedClass

sealed class Planet(val id: Int) {
        class BasicPlanet(id: Int) : PlanetAbs(id)
        class PlanetWithSatellites(id: Int, val satellitesNames: List<String>) : PlanetAbs(id)
    }

    fun main() {
        val mercury = PlanetAbs.BasicPlanet(0)
        val earth = PlanetAbs.PlanetWithSatellites(2, listOf("Moon"))
    }


