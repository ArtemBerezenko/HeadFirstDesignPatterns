package Patterns.Decorator.StarbuzzCoffee.decorator

import Patterns.Decorator.StarbuzzCoffee.Beverage
import Patterns.Decorator.StarbuzzCoffee.CondimentDecorator
import Patterns.Decorator.StarbuzzCoffee.component.Size

class Soy(private val beverage: Beverage) : CondimentDecorator() {
    override val description = beverage.description + ", Soy"
    override fun cost(): Double {
        var cost = beverage.cost()
        when(beverage.size) {
            Size.TALL -> cost += .10
            Size.GRANDE -> cost += .15
            Size.VENTI -> cost += .20
        }
        return cost
    }
}