package patterns.state

class GumballMachine(private val numberGumballs: Int) {

    val soldOutState: SoldOutState = SoldOutState(this)
    val noQuarterState: NoQuarterState = NoQuarterState(this)
    val hasQuarterState: HasQuarterState = HasQuarterState(this)
    val soldState: SoldState = SoldState(this)
    val winnerState: WinnerState = WinnerState(this)
    var state: State = soldOutState
    var count = 0

    init {
        count = numberGumballs
        if (numberGumballs > 0) {
            state = noQuarterState
        }
    }

    fun insertQuarter() = state.insertQuarter()

    fun ejectQuarter() = state.ejectQuarter()

    fun turnCrank() = state.run {
        turnCrank()
        dispense()
    }
    fun releaseBall() {
        println("A gumball comes rolling out the slot...")
        if (count != 0) {
            count--
        }
    }


}
