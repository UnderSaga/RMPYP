//fun main() {
//    val number = readln().toInt()
//    engineStatus(number)
//}
//
//fun engineStatus(engineNumber: Int): String{
//    return try{
//        rawEngineStatus(engineNumber)
//    } catch (e: engineNotFoundException) {
//        "engine $engineNumber not found"
//    } catch (e: SensorsMeltException) {
//        "engine $engineNumber offline"
//    }
//}
//
//fun rawEngineStatus(engineNumber: Int) : String {
//    return engineNumber.toString()
//}
