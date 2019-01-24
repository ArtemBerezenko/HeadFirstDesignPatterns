package Patterns.Decorator

import Patterns.Decorator.component.DarkRoast
import Patterns.Decorator.component.Espresso
import Patterns.Decorator.component.HouseBlend
import Patterns.Decorator.decorator.Mocha
import Patterns.Decorator.decorator.Soy
import Patterns.Decorator.decorator.Whip

fun main(args: Array<String>) {
    val beverage = Espresso()
    print(beverage.description + " $" + beverage.cost() + "\n")

    var beverage2: Beverage = DarkRoast()
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    print(beverage2.description + " $" + beverage2.cost() + "\n")

    var beverage3: Beverage = HouseBlend()
    beverage3 = Soy(beverage3)
    beverage3 = Mocha(beverage3)
    beverage3 = Whip(beverage3)
    print(beverage3.description + " $" + beverage3.cost())

}