fun quadrado() {
    print("valor1: ")
    val lado1 = readLine()

    print("valor2: ")
    val lado2 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()

        if (x == y) {
            println("quadradao")
        } else {
            println("ota coisa")
        }
    }

}

fun triangulo() {
    print("valor1: ")
    val lado1 = readLine()

    print("valor2: ")
    val lado2 = readLine()

    print("valor3: ")
    val lado3 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != ""
        && lado3 != null && lado3 != ""
    ) {
        val x = lado1.toInt()
        val y = lado2.toInt()
        val z = lado3.toInt()

        if (x == y && y == z) {
            println("triangulo")
        } else {
            println(" nada de triangulo equilatero")
        }
    }
}


//
//fun portaria() {
//    print("Qual sua idade? ")
//    val idade = readLine()
//
//    if (idade != null && idade != "") {
//        if (idade.toInt() < 18) {
//            println("Negado. Menores de idade não são permitidos.")
//            return
//        }
//    }
//
//    print("Qual é o tipo de convite? ")
//    var tipoConvite = readLine()
//
//    if (tipoConvite != null && tipoConvite != "") {
//        tipoConvite = tipoConvite.lowercase()
//
//        // Validação do tipo de convite
//        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
//            println("Negado. Convite inválido.")
//            return
//        }
//
//        print("Qual o código do convite? ")
//        var codigo = readLine()
//
//        if (codigo != null && codigo != "") {
//            codigo = codigo.lowercase()
//
//            if (tipoConvite == "comum" && codigo.startsWith("xt")) {
//                println("Welcome :)")
//            } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")
//            ) {
//                println("Welcome :)")
//            } else {
//                println("Negado. Convite inválido")
//            }
//        }
//    }
//}
//
//fun main() {
//    // quadrado()
//    //triangulo()
//    portaria()
//}

//fun main(){
//    for (i in 0..20 step 2) {
//        print("$i")
//    }
//    val str = "kotlin é pik"
//    for (char in str) {
//        print("$char")
//    }
//}

//fun main() {
//
//    var i = 0
//    do {
//        print("$i ")
//        i++
//    } while (i == 1000)
//
//    while (i == 1000) {
//        print("while")
//    }
//
//}

//fun main(){
//    do {
//        print("qual seu nome: ")
//        val value = readLine()
//    } while (value == "")
//}

//fun main(){
//
//    val str = "asdsadsdasdsdasdasdasd"
//
//    var i = 0
//    while (i < 80) {
//
//        if (i < 30) {
//            i++
//            continue
//        }
//
//        print("$i ")
//        i++
//    }
//}

//atvdd 1
//fun main(){
//    var i = 0
//
//    while (i < 51) {
//
//        if (i < 0) {
//            i++
//            continue
//        }
//        print("$i")
//        i++
//    }
//}
//

//atvdd 2
//fun main(){
//    var i = 50
//
//    while (i > 0) {
//        if (i > 50){
//            --i
//            continue
//        }
//        print("$i")
//        --i
//    }
//}

//fun main(){
//    for (i in 0..50) {
//        print("$i")
//    }
//}

//fun main(){
//    for (i in 50 downTo 0) {
//        print("$i")
//    }
//}

//fun main(){
//    for (i in 0..500) {
//        print("$i")
//    }
//}


fun main() {
}

fun ex1() {
    for (i in 1..50) {
        print("$i ")
    }
}

fun ex2() {
    for (i in 50 downTo 1) {
        print("$i ")
    }
}

fun ex3() {
    for (i in 1..50) {
        if (i % 5 == 0) {
            continue
        }
        print("$i ")
    }
}

fun ex4() {
    var soma = 0
    for (i in 1..500) {
        soma += i
    }
    println("Soma: $soma")
}

fun ex5 (n: Int) {
    for (i in 1..n) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}

fun ex5While(n: Int) {
    var str = ""
    var contador = 1
    var i = 0
    var j = 0

    while (i < n) {
        i++
        while (j < contador) {
            str += "#"
            j++
        }
        contador++
        str += "\n"
        j = 0
    }

    println(str)
}