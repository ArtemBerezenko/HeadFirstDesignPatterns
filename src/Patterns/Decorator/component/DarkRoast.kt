package Patterns.Decorator.component

import Patterns.Decorator.Beverage

class DarkRoast : Beverage() {
    override val description: String = "Dark Roast Coffee"
    override fun cost(): Double = .99
}