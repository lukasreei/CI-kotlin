// usado para comentar
// usasse var para declarar variavel
// usasse "" para declarar uma string

/**
 *  type Bit
 *  Double 64   ponto flutuante   . + numero, força a conversão
 *  float 32  ponto flutuante    f no final força a conversão
 *  long 64   numeros inteiros   L no final força a conversão
 *  int 32  numeros inteiros
 *  short 16 numeros inteiros max 32767 min -32768
 *  byte 8  numeros inteiros   max 127 min -128
 *  boolean ?
 *  String ?
 *  char ?/
 */

//unsigned
// varia numeros do 0 a 255, retirando a parte negativa


//val = valor imutavel
//var valor mutavel

/**
 * adição +  ex: var idade = 40       idade += 1
 * subtraçãoo -
 * multiplicação *
 * divisão /   ex: var idade: float = 10 / 3 or var idade: int = 30 / 3
 * resto da divisão = %   ex var idade = 12 % 5
 */


// fun  declara função       em seguida o nome da funcção, exemplo: fun helloworld

// fun helloworld(nome: String): String{
// }


// tipo de retorno
// unit    o tipo unit diz que a funcao não possui retorno
// double, float, long, int, byte, booelan, string e char
//instancias de classes    uma função é capaz ded retorna um tipo de dado resultado da instancia de uma classe

//chamada de função
//        fun helloworld(nome: String): String {
//           return "Hello $nome"
//      }



/**fun main() {

var nome: String = "Lukas Romero de A. dos Santos"
var texto: String

var numero: Byte = 44

var pib: Long = 1869000000000

var PP: Long = 211000000
println("o PIB do Brasil é $pib")
println("pb do BR ${pib/PP}")
}
 */

/**fun main(){
helloworld()
println("o valor da soma é ${sum(a = 5, b = 10)}")
}
fun sum(a: Int, b: Int): Int {
return (a + b)
}

fun helloworld(){
println("Hello World")
}
 */

//FUNÇÕES EM UMA UNICA LINHA
//fun main(){
//helloWorld()
//println("a soma é ${sum(a = 10, b = 5)}")
//   println("divisão ${divisao(a = 9f, b = 3f)}")
//    println(divisao(a= 12f, b=3.5f))
//}
//fun helloWorld(){
//  println("hello wordl")
//}
//fun sum (a: Int, b: Int): Int (a + b)
//
//fun divisao (a: Float, b: Float) = (a / b)

//função string
//fun main(){
//   val str = "pg kotlin."
//  println("o tamanho da string: ${str.length}")
//   println("a posição (index) 0 string: ${str[0]}")
//   println(str.startsWith("p"))
// println(str.endsWith("c"))
//
//  println(str.substring(1,4))
// println(str.replace("kotlin", "kotlin é show"))
//   println(str.lowercase())
// println(str.uppercase())

//}
import kotlin.math.*
//fun main(){
//  println(max( 5,10))
//  println(min( 5,10))
//   println(sqrt(5.67f))
// println(PI)
//  println(E)
// println(round(x = 3142342.2524))
//}
import kotlin.math.*

//atividade 1
//fun converte(anos: Int){
   // println("$anos anos equivalem a: ")
 //   println("${anos * 12} meses")
  //  println("${anos * 365} dias")
  //  println("${anos * 365 * 24} horas")
   // println("${anos * 365 * 24 * 60} minutos")
  //  println("${anos * 365 * 24 * 60 * 60} segundos")
// }
//
//fun milhaskm(milhas: Float): Float = milhas * 1.6f
//
//fun caracteres(str: String) = str.length

//fun cubo(n: Int) = n * n * n

//fun main(){
  //  converte(2)
 //   println(caracteres("cubo"))
    //cubo(3)
  //  println(cubo(3))
//
 //
//}


//fluxo

//fun maiorDeIdade(idade: Int){
//    if (idade > 18) {
//        println("maior de idade")
//        if (idade > 60) {
//            println("terceira idade")
//        }
//    } else if (idade < 10) {
//        println("criança")
//    }
//    else{
//        println("menor de idade")
//    }
//}
//fun main() {
//    maiorDeIdade(19)
//    maiorDeIdade(15)
//}



//fun main(){
//
//    val a = false
//    val b = false
//    val c = true
//    val d = true
//
//    println(a && b && c && d)
//
//}


//fun bonus(cargo: String): Float{
//
//    var bonus = 0f
//
//    if (cargo == "gerente") {
//        bonus = 2000f
//    }
//    else if (cargo == "coordenador") {
//            bonus = 1500f
//    }
//    else if (cargo == "engenheiro de software") {
//        bonus = 1000f
//    }
//    else if (cargo == "estagiario") {
//        bonus = 500f
//    }
//    return bonus
//}
//
//fun bonusWhen(cargo: String): Float{
//     return when (cargo){
//        "gerente" -> 2000f
//        "coordenador" -> 1500f
//        "engenheiro de software" -> 1000f
//        "estagiario" -> 500f
//        else -> 0f
//    }
//}
//fun main(){
//    bonusWhen("gerente")
//    val n = false
//    when (n) {
//        true -> println("1..10")
//        false -> println("2..3")
//    }    }


//A estrutura de múltipla seleção when é utilizada para comparar um valor com conjunto de opções. Dessa forma, cada opção é verificada sequencialmente e uma vez que haja uma correspondência um valor pode ser retornado ou um comando executado.
//
//Essa estrutura é muito utilizada quando uma variável pode assumir um dentre alguns valores conhecidos.  por exemplo, estado pode ter os valores ativo ou inativo e qual mensagem será exibida para o usuário depende disso.
//
//val estado = "ativo"
//
//when(estado) {
//    "ativo" -> print("Clique para desativar")
//    "inativo" -> print("Clique para ativar")
//}
//
//Opcionalmente podemos adicionar um bloco else às ramificações de when. Dessa forma, quando o valor informado não corresponder a nenhuma das opções esse bloco será executado
//val estado = "ativo"
//
//when(estado) {
//    "ativo" -> print("Clique para desativar")
//    "inativo" -> print("Clique para ativar")
//    else -> {
//        print("valor de estado é desconhecido")
//    }
//}
//
//Assim como o bloco else acima, qualquer ramificação dentro de when pode ser um bloco de código delimitado por chaves { }, ou um único comando ou expressão e nesse caso as chaves são opcionais.
//
//É possível ainda agrupar diferentes valores dentro de uma única ramificação em when. Com isso o bloco de código pertencente a ela será executado caso haja uma correspondência por qualquer um dos seus valores
//
//val estado = ""
//
//when(estado) {
//    "ativo", "inativo" -> print("estado conhecido)
//    else -> {
//        print("estado desconhecido")
//    }
//}
//


//força a pessoa a digite seu nome
/** fun main(){
    do {
        print("qual seu nome: ")
        val value = readLine()
    } while (value == "")
}
        */