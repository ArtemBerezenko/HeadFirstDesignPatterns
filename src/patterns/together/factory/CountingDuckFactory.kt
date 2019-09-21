package patterns.together.factory

import patterns.together.Quackable
import patterns.together.decorator.QuackCounter
import patterns.together.impl.DuckCall
import patterns.together.impl.MallardDuck
import patterns.together.impl.RedheadDuck
import patterns.together.impl.RubberDuck

class CountingDuckFactory : AbstractDuckFactory() {
    override fun createMallardDuck(): Quackable = QuackCounter(MallardDuck())
    override fun createRedheadDuck(): Quackable = QuackCounter(RedheadDuck())
    override fun createDuckCall(): Quackable = QuackCounter(DuckCall())
    override fun createRubberDuck(): Quackable = QuackCounter(RubberDuck())
}