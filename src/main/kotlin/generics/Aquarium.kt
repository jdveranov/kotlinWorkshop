package generics


fun main() {
    genericsExample()
}

 fun genericsExample() {
     val aquarium4 = Aquarium(LakeWater())
     aquarium4.waterSupply.filter()
     aquarium4.addWater()
 }



open class WaterSupply (var needsProcessing: Boolean)

class Aquarium<T: WaterSupply>(val waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needsProcessing) { "water supply needs processing first" }
        println("adding water from $waterSupply")
    }
}



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


