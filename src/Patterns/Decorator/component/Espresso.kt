package Patterns.Decorator.component

import Patterns.Decorator.Beverage

class Espresso(override val description: String = "Espresso") : Beverage() {
    override fun cost() = 1.99
}