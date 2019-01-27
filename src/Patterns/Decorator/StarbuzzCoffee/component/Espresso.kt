package Patterns.Decorator.StarbuzzCoffee.component

import Patterns.Decorator.StarbuzzCoffee.Beverage

class Espresso(override val description: String = "Espresso") : Beverage() {
    override fun cost() = 1.99
}