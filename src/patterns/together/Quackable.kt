package patterns.together

import patterns.together.observer.QuackObservable

interface Quackable : QuackObservable {
    fun quack()
}