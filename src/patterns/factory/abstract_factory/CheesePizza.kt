package patterns.factory.abstract_factory

class CheesePizza(private val pizzaIngredientFactory: PizzaIngredientFactory) : Pizza() {

    override fun prepare() {
        println("Preparing + $name")
        dough = pizzaIngredientFactory.createDough()
        sauce = pizzaIngredientFactory.createSauce()
        cheese = pizzaIngredientFactory.createCheese()
    }
}