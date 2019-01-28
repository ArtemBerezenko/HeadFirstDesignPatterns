package patterns.decorator.starbuzzcoffee

import patterns.decorator.starbuzzcoffee.component.Size

abstract class Beverage {
    open val description = "Unknown Beverage"
    open lateinit var size: Size
    abstract fun cost(): Double
}