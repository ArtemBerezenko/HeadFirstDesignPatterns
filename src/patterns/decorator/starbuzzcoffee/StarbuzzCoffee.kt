package patterns.decorator.starbuzzcoffee

import patterns.decorator.starbuzzcoffee.component.DarkRoast
import patterns.decorator.starbuzzcoffee.component.Espresso
import patterns.decorator.starbuzzcoffee.component.HouseBlend
import patterns.decorator.starbuzzcoffee.component.Size
import patterns.decorator.starbuzzcoffee.decorator.Mocha
import patterns.decorator.starbuzzcoffee.decorator.Soy
import patterns.decorator.starbuzzcoffee.decorator.Whip

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