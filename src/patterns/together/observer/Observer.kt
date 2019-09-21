package patterns.together.observer

interface Observer {
    fun update(duck: QuackObservable)
}