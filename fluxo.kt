
fun bonus(cargo: String): Float{

    var bonus = 0f

    if (cargo == "gerente") {
        bonus = 2000f
    }
    else if (cargo == "coordenador") {
        bonus = 1500f
    }
    else if (cargo == "engenheiro de software") {
        bonus = 1000f
    }
    else if (cargo == "estagiario") {
        bonus = 500f
    }
    return bonus
}
fun bonus(cargo: String, experiencia: Int): Float{

    var bonus = 0f

    if (cargo == "gerente") {
        if (experiencia < 2) {
            bonus = 2000f
        } else {
            bonus = 3000f
        }
    }
    else if (cargo == "coordenador") {
        if (experiencia < 1) {
            bonus = 1500f
        } else {
            bonus = 1800f
        }
    }
    else if (cargo == "engenheiro de software") {
        bonus = 1000f
    }
    else if (cargo == "estagiario") {
        bonus = 500f
    }
    return bonus
}
fun main(){
    val bonus = bonus("gerente", experiencia = 20)
    println(bonus)}