fun main(){
    println("Введите трехзначное число")
    val S: String? = readLine()
    var X: Int  =S!!.toInt()
    if((X % 2) == 0){
        println("четная")
    }
    else{
        println("нечетная")
    }
}