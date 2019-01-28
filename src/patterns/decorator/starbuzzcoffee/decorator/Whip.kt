package patterns.decorator.starbuzzcoffee.decorator

import patterns.decorator.starbuzzcoffee.Beverage
import patterns.decorator.starbuzzcoffee.CondimentDecorator

class Whip(private val beverage: Beverage) : CondimentDecorator() {
    override val description = beverage.description + ", Whip"
    override fun cost(): Double = .20 + beverage.cost()
}