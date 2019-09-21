package patterns.together.composite

import patterns.together.Quackable
import patterns.together.observer.Observer

class Flock : Quackable {
    val quackers = arrayListOf<Quackable>()

    override fun registerObserver(observer: Observer) {
        val iterator = quackers.iterator()
        while (iterator.hasNext()) {
            val quacker = iterator.next()
            quacker.registerObserver(observer)
        }
    }

    override fun notifyObservers() {}

    fun add(quacker: Quackable) = quackers.add(quacker)

    override fun quack() {
        val iterator = quackers.iterator()
        while (iterator.hasNext()) {
            val quacker = iterator.next()
            quacker.quack()
        }
    }
}