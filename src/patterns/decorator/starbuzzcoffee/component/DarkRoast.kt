package patterns.decorator.starbuzzcoffee.component

import patterns.decorator.starbuzzcoffee.Beverage

class DarkRoast : Beverage() {
    override val description: String = "Dark Roast Coffee"
    override fun cost(): Double = .99
}