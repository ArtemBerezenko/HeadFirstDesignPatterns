package Patterns.Decorator.decorator

import Patterns.Decorator.Beverage
import Patterns.Decorator.CondimentDecorator

class Mocha(private var beverage: Beverage) : CondimentDecorator() {
    override val description = beverage.description + ", Mocha"
    override fun cost() = .20 + beverage.cost()
}