fun atvd1() {
    print("digite seu nome: ")
    var convidado = readLine()

    if (convidado != "lukas"){
        print("você não é quem eu espero")
        return
    }else("seja bem vindo")
    println("digite a senha: ")
    val senha: Int = readLine()!!.toInt()
    if (senha != 1234){
        print("errado")
    }else(print("chega"))

    print("qual teu local? ")
    var local = readLine()
    if (local != "front" && local != "camarote" ){
        print("qual foi? ta brisando?")
    }else if(local == "front"){
        print("a esquerda")
    }else(print("a direita"))
}

fun atvd2(){
    print("vamos tirar a sua media ")
    print("digite sua primeira nota: ")
    var nota1 = readLine()!!.toInt()
    print("digite sua segunda nota: ")
    var nota2 = readLine()!!.toInt()
    print("digite sua terceira nota: ")
    var nota3 = readLine()!!.toInt()
    var media = (nota1 + nota2 + nota3) / 3f

    println("media: $media")
}
fun main(){
    atvd2()
}