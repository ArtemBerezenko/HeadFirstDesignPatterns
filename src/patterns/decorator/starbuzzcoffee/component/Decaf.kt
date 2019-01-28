package patterns.decorator.starbuzzcoffee.component

import patterns.decorator.starbuzzcoffee.Beverage

class Decaf(override val description: String = "Decaf") : Beverage() {
    override fun cost(): Double = .45
}