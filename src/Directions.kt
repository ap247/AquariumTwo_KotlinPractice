enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    var path = mutableListOf(Directions.START)

    val north = {path.add(Directions.NORTH)}
    val south = {path.add(Directions.SOUTH)}
    val east = {path.add(Directions.EAST)}
    val west = {path.add(Directions.WEST)}
    val end = {path.add(Directions.END); println("Game Over: $path"); path.clear(); false}

    fun move(where: () -> Boolean) {
        where.invoke()
    }

    fun makeMove(advance: String?) {
        if(advance == "n") {
            move(north)
        } else if(advance == "s") {
            move(south)
        } else if(advance == "e") {
            move(east)
        } else if (advance == "w") {
            move(west)
        } else {
            move(end)
        }

    }

}

fun main(args: Array<String>) {
    val game = Game()
    println(game.path)
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()
    println(game.path)

    while(true) {
        print("Enter a direction: n/s/e/w:")
        game.makeMove(readLine())

    }

}

