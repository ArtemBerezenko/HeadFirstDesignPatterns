package Patterns.Decorator.StarbuzzCoffee.decorator

import Patterns.Decorator.StarbuzzCoffee.Beverage
import Patterns.Decorator.StarbuzzCoffee.CondimentDecorator

class Mocha(private var beverage: Beverage) : CondimentDecorator() {
    override val description = beverage.description + ", Mocha"
    override fun cost() = .20 + beverage.cost()
}