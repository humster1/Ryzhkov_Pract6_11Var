fun main(){
    println("Введите P-пятерок, CH-четверок, TR-двоек, DV-двоек")
    val P: String? = readLine()
    var A: Int  =P!!.toInt()
    val CH: String? = readLine()
    var B: Int  =CH!!.toInt()
    val TR: String? = readLine()
    var C: Int  =TR!!.toInt()
    val DV: String? = readLine()
    var Y: Int  =DV!!.toInt()
    val K: Int = A+B+C+Y
    println("Человек в классе "+(K))
}