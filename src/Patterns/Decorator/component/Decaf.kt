package Patterns.Decorator.component

import Patterns.Decorator.Beverage

class Decaf(override val description: String = "Decaf") : Beverage() {
    override fun cost(): Double = .45
}