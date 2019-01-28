package patterns.decorator.starbuzzcoffee.component

import patterns.decorator.starbuzzcoffee.Beverage

class HouseBlend(override val description: String = "House Blend Coffee") : Beverage() {
    override fun cost() = .89
}