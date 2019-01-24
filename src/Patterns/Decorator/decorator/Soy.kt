package Patterns.Decorator.decorator

import Patterns.Decorator.Beverage
import Patterns.Decorator.CondimentDecorator

class Soy(private val beverage: Beverage) : CondimentDecorator() {
    override val description = beverage.description + ", Soy"
    override fun cost() = .15 + beverage.cost()
}