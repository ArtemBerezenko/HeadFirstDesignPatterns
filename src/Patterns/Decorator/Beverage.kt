package Patterns.Decorator

abstract class Beverage {
    open val description = "Unknown Beverage"
    abstract fun cost(): Double
}