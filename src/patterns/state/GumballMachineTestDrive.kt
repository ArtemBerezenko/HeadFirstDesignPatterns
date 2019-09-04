package patterns.state

fun main() {
    val gumballMachine = GumballMachine(5)
    println(gumballMachine.state)

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()

    println(gumballMachine.state)

    gumballMachine.insertQuarter()
    gumballMachine.ejectQuarter()
    gumballMachine.turnCrank()

    println(gumballMachine.state)

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    gumballMachine.ejectQuarter()

    println(gumballMachine.state)

    gumballMachine.insertQuarter()
    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()

    println(gumballMachine.state)

}