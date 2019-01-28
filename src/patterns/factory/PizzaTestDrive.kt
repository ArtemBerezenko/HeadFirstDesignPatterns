package patterns.factory

fun main() {
    val nyStore = NYPizzaStore()
    val chicagoStore = ChicagoPizzaStore()

    var pizza: Pizza? = nyStore.orderPizza("cheese")
    print("Ethan ordered a ${pizza?.name}\n")

    pizza = chicagoStore.orderPizza("cheese")
    print("Joel ordered a ${pizza?.name}\n")
}
