import java.math.BigDecimal

fun main () {
    val statement = Statement()
    statement.printOwing()
}
/*
// Without local variables before Refactoring
class Statement {
    private val orderLines = listOf(OrderLine(30.00), OrderLine(25.99))
    private val name = "Phil Johnson"

    fun printOwing() {
        var outstanding: Double = 0.0

        //  print banner
        println("********************************")
        println("******** Customer Owes *********")
        println("********************************")

        //  calculate outstanding
        for (orderLine in orderLines) {
            outstanding += orderLine.amount
        }

        //  print details
        println("Name: $name")
        println("Amount: $outstanding")
    }
}
*/

/*
//  Without local variables after Refactoring
class Statement {
    private val orderLines = listOf(OrderLine(30.00), OrderLine(25.99))
    private val name = "Phil Johnson"

    fun printOwing() {
        var outstanding: Double = 0.0

        printBanner()

        //  calculate outstanding
        for (orderLine in orderLines) {
            outstanding += orderLine.amount
        }

        //  print details
        println("Name: $name")
        println("Amount: $outstanding")
    }

    private fun printBanner() {
        println("********************************")
        println("******** Customer Owes *********")
        println("********************************")
    }
}
 */

/*
//  After refactoring with local variables
class Statement {
    private val orderLines = listOf(OrderLine(30.00), OrderLine(25.99))
    private val name = "Phil Johnson"

    fun printOwing() {
        var outstanding: Double = 0.0

        printBanner()

        //  calculate outstanding
        for (orderLine in orderLines) {
            outstanding += orderLine.amount
        }

        printDetails(outstanding)
    }

    private fun printDetails(outstanding: Double) {
        println("Name: $name")
        println("Amount: $outstanding")
    }

    private fun printBanner() {
        println("********************************")
        println("******** Customer Owes *********")
        println("********************************")
    }
}
 */

//  After reassigning a local variable
class Statement {
    private val orderLines = listOf(OrderLine(30.00), OrderLine(25.99))
    private val name = "Phil Johnson"

    fun printOwing() {
        var outstanding: Double = 0.0

        printBanner()
        outstanding = getOutstanding(outstanding)
        printDetails(outstanding)
    }

    private fun getOutstanding(previousAmount: Double): Double {
        var outstanding = previousAmount
        for (orderLine in orderLines) {
            outstanding += orderLine.amount
        }
        return outstanding
    }

    private fun printDetails(outstanding: Double) {
        println("Name: $name")
        println("Amount: $outstanding")
    }

    private fun printBanner() {
        println("********************************")
        println("******** Customer Owes *********")
        println("********************************")
    }
}

class OrderLine {
    var amount: Double = 0.0

    constructor(amount: Double) {
        this.amount = amount
    }
}