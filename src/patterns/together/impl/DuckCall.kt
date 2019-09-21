package patterns.together.impl

import patterns.together.Quackable
import patterns.together.observer.Observer
import patterns.together.observer.impl.Observable

class DuckCall : Quackable {
    val observable: Observable = Observable(this)

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }

    override fun quack() {
        println("Kwak")
        notifyObservers()
    }
}