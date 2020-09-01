class SimpleSpice {
    var name = "curry"
    var spiciness = "mild"
    val heat : Int
        get() {return 5}
}

class Spice(var name: String, var spiciness: String = "mild") {
     val heat : Int
       get () {
           return when(spiciness) {
               "mild" -> 1
               "medium" -> 3
               "spicy" -> 5
               "very spicy" -> 7
               "extremely spicy" -> 10
               else -> 0
           }
       }
}

fun main(args: Array<String>) {
    val simpleSpice = SimpleSpice()
    println("${simpleSpice.name} ${simpleSpice.heat}")

    val spices = listOf(Spice("pepper", "medium"))

    val lessSpicy = spices.filter{it.heat < 5}
}

fun makeSalt() = Spice("Salt", "None")