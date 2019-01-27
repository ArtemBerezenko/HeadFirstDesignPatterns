package Patterns.Decorator.StarbuzzCoffee.component

import Patterns.Decorator.StarbuzzCoffee.Beverage

class DarkRoast : Beverage() {
    override val description: String = "Dark Roast Coffee"
    override fun cost(): Double = .99
}