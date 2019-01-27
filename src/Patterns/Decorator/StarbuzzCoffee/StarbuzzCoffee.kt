package Patterns.Decorator.StarbuzzCoffee

import Patterns.Decorator.StarbuzzCoffee.component.DarkRoast
import Patterns.Decorator.StarbuzzCoffee.component.Espresso
import Patterns.Decorator.StarbuzzCoffee.component.HouseBlend
import Patterns.Decorator.StarbuzzCoffee.component.Size
import Patterns.Decorator.StarbuzzCoffee.decorator.Mocha
import Patterns.Decorator.StarbuzzCoffee.decorator.Soy
import Patterns.Decorator.StarbuzzCoffee.decorator.Whip

fun main() {
    val beverage = Espresso()
    print(beverage.description + " $" + beverage.cost() + "\n")

    var beverage2: Beverage = DarkRoast()
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    print(beverage2.description + " $" + beverage2.cost() + "\n")

    var beverage3: Beverage = HouseBlend()
    beverage3.size = Size.GRANDE
    beverage3 = Soy(beverage3)
    beverage3 = Mocha(beverage3)
    beverage3 = Whip(beverage3)
    print(beverage3.description + " $" + beverage3.cost())

}