package patterns.factory.factory_method

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
