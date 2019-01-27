package Patterns.Decorator.StarbuzzCoffee

import Patterns.Decorator.StarbuzzCoffee.component.Size

abstract class Beverage {
    open val description = "Unknown Beverage"
    open lateinit var size: Size
    abstract fun cost(): Double
}