    sealed class Planet(val id: Int) {
        class BasicPlanet(id: Int) : Planet(id)
        class PlanetWithSatellites(id: Int, val satellitesNames: List<String>) : Planet(id)
    }

    fun main() {
        val mercury = Planet.BasicPlanet(0)
        val earth = Planet.PlanetWithSatellites(2, listOf("Moon"))
    }


