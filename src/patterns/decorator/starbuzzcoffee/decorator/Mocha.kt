package patterns.decorator.starbuzzcoffee.decorator

import patterns.decorator.starbuzzcoffee.Beverage
import patterns.decorator.starbuzzcoffee.CondimentDecorator

class Mocha(private var beverage: Beverage) : CondimentDecorator() {
    override val description = beverage.description + ", Mocha"
    override fun cost() = .20 + beverage.cost()
}