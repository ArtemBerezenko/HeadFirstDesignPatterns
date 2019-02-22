package patterns.factory.abstract_factory

class ChicagoPizzaStore : PizzaStore() {

    override fun createPizza(type: String): Pizza? {
        val ingredientFactory = ChicagoPizzaIngredientFactory()

        return when (type) {
            "cheese" -> CheesePizza(ingredientFactory).apply { name = "Chicago Style Cheese Pizza" }
            "veggie" -> VeggiePizza(ingredientFactory).apply { name = "Chicago Style Veggie Pizza" }
            "clam" -> ClamPizza(ingredientFactory).apply { name = "Chicago Style Clam Pizza" }
            "pepperoni" -> PepperoniPizza(ingredientFactory).apply { name = "Chicago Style Pepperoni Pizza" }
            else -> null
        }
    }
}
