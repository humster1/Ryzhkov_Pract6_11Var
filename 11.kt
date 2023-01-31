import kotlin.math.pow
import kotlin.math.sin
fun main(){
    println("Значение x")
    val S: String? = readLine()
    var X: Double =S!!.toDouble()
    if(X>1.1){
        X=9-X
        println("Ваш ответ: $X")
    }
    else{
        val result=Math.pow(X, 4.0)
        X=(sin(3*X) / (result+1))
        println("Ваш ответ: $X")
    }
}