package Patterns.Decorator.decorator

import Patterns.Decorator.Beverage
import Patterns.Decorator.CondimentDecorator

class Whip(private val beverage: Beverage) : CondimentDecorator() {
    override val description = beverage.description + ", Whip"
    override fun cost(): Double = .20 + beverage.cost()
}