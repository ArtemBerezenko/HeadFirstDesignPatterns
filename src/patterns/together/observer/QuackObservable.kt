package patterns.together.observer

interface QuackObservable {
    fun registerObserver(observer: Observer)
    fun notifyObservers()
}