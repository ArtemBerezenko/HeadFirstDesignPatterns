package patterns.together.factory

import patterns.together.impl.MallardDuck
import patterns.together.Quackable
import patterns.together.impl.DuckCall
import patterns.together.impl.RedheadDuck
import patterns.together.impl.RubberDuck

class DuckFactory : AbstractDuckFactory() {
    override fun createMallardDuck(): Quackable = MallardDuck()
    override fun createRedheadDuck(): Quackable = RedheadDuck()
    override fun createDuckCall(): Quackable = DuckCall()
    override fun createRubberDuck(): Quackable = RubberDuck()
}