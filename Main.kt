import kotlin.math.*

//atividade 1
fun converte(anos: Int){
    println("$anos anos equivalem a: ")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")
}

fun milhaskm(milhas: Float): Float = milhas * 1.6f

fun caracteres(str: String) = str.length

fun cubo(n: Int) = n * n * n

fun main(){
    converte(2)
    println(caracteres("cubo"))
    cubo(3)
    println(cubo(3))


}

