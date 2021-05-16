fun main () {
    val extractMethodBefore = ExtractMethodBefore()
    extractMethodBefore.printOwing(29.99)

    val extractMethodAfter = ExtractMethodAfter()
    extractMethodAfter.printOwing(29.99)
}

class ExtractMethodBefore {
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

class ExtractMethodAfter {
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