fun main () {
    val statement = Statement()
    statement.printOwing(29.99)
}

class StatementBefore {
    private val name = "Phil"

    fun printOwing(amount: Double) {
        printBanner()

        //print details
        println("Name: $name")
        println("Amount: $amount")
    }

    private fun printBanner() {
        println("Printing Banner")
    }
}

class Statement {
    private val name = "Phil"

    fun printOwing(amount: Double) {
        printBanner()
        printDetails(amount)
    }

    private fun printBanner() {
        println("Printing Banner")
    }

    private fun printDetails(amount: Double) {
        println("Name: $name")
        println("Amount: $amount")
    }
}