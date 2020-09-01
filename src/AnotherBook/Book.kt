package AnotherBook

import java.util.*

const val MAX_NUMBER_BOOKS = 20
class Book(val title: String, val author: String, val year: Int, var pages: Int = 100) {
    fun giveSomeInfo(): Pair <String, String> {
        return (title to author)
    }

    fun giveAllInfo(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(hasBooks: Int) : Boolean {
        return (hasBooks < MAX_NUMBER_BOOKS)
    }

    object Constants {
        const val BASE_URL = "http://www.turtlecare.net/"
    }

    fun printUrl() {
        println(Constants.BASE_URL + title + ".html")
    }

    companion object {
        val BASE_URL = "http://www.turtlecare.net/"
    }
}

fun Book.weight() : Double {return (pages * 1.5)}
fun Book.tornPages(torn: Int) = if (pages >= torn) pages -= torn else pages = 0

class Puppy() {
    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(12))
    }
}

fun main(args: Array<String>) {
    val book1 = Book("Harry Potter", "JK Rowling", 1997)

    val (title, author, year) = book1.giveAllInfo()

    println("Here is your book $title written by $author in $year")

    val allBooks = setOf("Romeo and Juliet", "Macbeth", "Julius Caesar")

    val library = mapOf(allBooks to "William Shakespeare")

    val hasHamlet = allBooks.any{it == "Hamlet"}

    val moreBooks = mutableMapOf("Percy Jackson" to "Rick Riordan")

    moreBooks.getOrPut("Divergent") {"Veronica Roth"}

    val puppy = Puppy()
    val book = Book("Oliver Twist", "Charles Dickens", 1837, 540)

    /*
    while(book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages} left in ${book.title}")
    }
    println("Sad puppy, no more pages in ${book.title}. ")
     */

}
