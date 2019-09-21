package patterns.together.factory

import patterns.together.Quackable
import patterns.together.adapter.GooseAdapter
import patterns.together.decorator.QuackCounter
import patterns.together.impl.Goose

class GooseFactory: AbstractDuckFactory() {
    override fun createMallardDuck(): Quackable = QuackCounter(GooseAdapter(Goose()))
    override fun createRedheadDuck(): Quackable = QuackCounter(GooseAdapter(Goose()))
    override fun createDuckCall(): Quackable = QuackCounter(GooseAdapter(Goose()))
    override fun createRubberDuck(): Quackable = QuackCounter(GooseAdapter(Goose()))
}