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

fun portaria() {
    print("Qual sua idade? ")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos.")
            return
        }
    }

    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()

        // Validação do tipo de convite
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. Convite inválido.")
            return
        }

        print("Qual o código do convite? ")
        var codigo = readLine()

        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()

            if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                println("Welcome :)")
            } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")
            ) {
                println("Welcome :)")
            } else {
                println("Negado. Convite inválido")
            }
        }
    }
}

fun main() {
    // quadrado()
    //triangulo()
    portaria()
}