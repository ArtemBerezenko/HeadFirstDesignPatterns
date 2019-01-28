package patterns.factory

class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(type: String) =
            when (type) {
                "cheese" -> ChicagoStyleCheesePizza()
                "veggie" -> ChicagoStyleVeggiePizza()
                "clam" -> ChicagoStyleClamPizza()
                "pepperoni" -> ChicagoStylePepperoniPizza()
                else -> null
            }
}
