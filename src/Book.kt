open class Book(val title : String, val author :String) {
    private var currentPage : Int = 0

    open fun readPage() {
        currentPage++
    }

}

class eBook(title : String, author :String, val format : String = "text") : Book(author, title) {
    private var wordCount : Int = 0

    override fun readPage() {
        wordCount += 250
    }

}