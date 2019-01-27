package Patterns.Decorator.StarbuzzCoffee.component

import Patterns.Decorator.StarbuzzCoffee.Beverage

class HouseBlend(override val description: String = "House Blend Coffee") : Beverage() {
    override fun cost() = .89
}