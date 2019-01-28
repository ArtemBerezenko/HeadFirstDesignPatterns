package patterns.decorator.starbuzzcoffee.component

import patterns.decorator.starbuzzcoffee.Beverage

class Espresso(override val description: String = "Espresso") : Beverage() {
    override fun cost() = 1.99
}