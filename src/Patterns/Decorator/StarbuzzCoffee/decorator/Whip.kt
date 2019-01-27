package Patterns.Decorator.StarbuzzCoffee.decorator

import Patterns.Decorator.StarbuzzCoffee.Beverage
import Patterns.Decorator.StarbuzzCoffee.CondimentDecorator

class Whip(private val beverage: Beverage) : CondimentDecorator() {
    override val description = beverage.description + ", Whip"
    override fun cost(): Double = .20 + beverage.cost()
}