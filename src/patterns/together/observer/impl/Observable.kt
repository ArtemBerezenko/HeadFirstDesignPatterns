package patterns.together.observer.impl

import patterns.together.observer.Observer
import patterns.together.observer.QuackObservable

class Observable(val duck: QuackObservable) : QuackObservable {
    private val observers = arrayListOf<Observer>()

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun notifyObservers() {
        val iterator = observers.iterator()
        while (iterator.hasNext()) {
            val observer = iterator.next()
            observer.update(duck)
        }
    }
}