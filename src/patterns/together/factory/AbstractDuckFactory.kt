package patterns.together.factory

import patterns.together.Quackable

abstract class AbstractDuckFactory {
    abstract fun createMallardDuck(): Quackable
    abstract fun createRedheadDuck(): Quackable
    abstract fun createDuckCall(): Quackable
    abstract fun createRubberDuck(): Quackable
}