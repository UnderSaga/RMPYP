fun main(){
    val name = readln()
    val plate = NibirunianClass()
    plate.createNamePlate(name)
    println(plate.namePlate)
}

class NibirunianClass {
    var namePlate = ""
    fun createNamePlate(name: String){
        namePlate = "Живи долго и счастливо, $name"
    }
}