package generics


fun main() {
    genericsExample()
}

fun genericsExample() {
    val aquarium = Aquarium(TapWater())
    println(aquarium.hasWaterSupplyOfType<TapWater>())
}


open class WaterSupply(var needsProcessing: Boolean)

class Aquarium<T : WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        if (waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("water added")
    }

}


inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R


class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

interface Cleaner<T : WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicalCleaners()
}

fun isWaterClean(aquarium: Aquarium<TapWater>) {
    println("aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
}


