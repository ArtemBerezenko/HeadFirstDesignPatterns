package Patterns.Decorator.component

import Patterns.Decorator.Beverage

class HouseBlend(override val description: String = "House Blend Coffee") : Beverage() {
    override fun cost() = .89
}