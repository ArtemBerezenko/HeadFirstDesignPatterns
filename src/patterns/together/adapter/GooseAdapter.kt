package patterns.together.adapter

import patterns.together.Quackable
import patterns.together.impl.Goose
import patterns.together.observer.Observer
import patterns.together.observer.QuackObservable
import patterns.together.observer.impl.Observable

class GooseAdapter(private val goose: Goose) : Quackable {
    val observable: Observable = Observable(this)

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }

    override fun quack() {
        goose.honk()
        notifyObservers()
    }
}