fun main() {
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