package Aquarium

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val pleco = Plecostomus1()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

interface FishAction1 {
    fun eat()
}

interface FishColor {
    val color: String
}

class Plecostomus1(fishColor: FishColor = GoldColor):
        FishAction1 by PrintingFishAction("a lot of algae"),
        FishColor by fishColor


object GoldColor: FishColor {
    override val color = "gold"
}

object RedColor: FishColor {
    override val color = "red"
}

class PrintingFishAction(val food : String): FishAction1 {
    override fun eat() {
        println(food)
    }
}

