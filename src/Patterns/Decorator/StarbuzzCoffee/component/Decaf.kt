package Patterns.Decorator.StarbuzzCoffee.component

import Patterns.Decorator.StarbuzzCoffee.Beverage

class Decaf(override val description: String = "Decaf") : Beverage() {
    override fun cost(): Double = .45
}