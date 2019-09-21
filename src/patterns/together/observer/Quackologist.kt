package patterns.together.observer

class Quackologist : Observer {
    override fun update(duck: QuackObservable) {
        println("Quackologist: $duck just quacked")
    }
}