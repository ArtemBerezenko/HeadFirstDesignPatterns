package patterns.together.decorator

import patterns.together.Quackable
import patterns.together.observer.Observer
import patterns.together.observer.QuackObservable
import patterns.together.observer.impl.Observable

class QuackCounter(val duck: Quackable) : Quackable {
    companion object {
        var numberOfQuacks = 0
    }

    override fun registerObserver(observer: Observer) {
        duck.registerObserver(observer)
    }

    override fun notifyObservers() {
        duck.notifyObservers()
    }

    override fun quack() {
        duck.quack()
        numberOfQuacks++
        notifyObservers()
    }
}