package patterns.factory

class NYPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza? =
            when (type) {
                "cheese" -> NYStyleCheesePizza()
                "veggie" -> NYStyleVeggiePizza()
                "clam" -> NYStyleClamPizza()
                "pepperoni" -> NYStylePepperoniPizza()
                else -> null
            }
}