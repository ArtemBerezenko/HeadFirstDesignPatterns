package patterns.factory.abstract_factory

class ClamPizza(private val pizzaIngredientFactory: PizzaIngredientFactory) : Pizza() {
    override fun prepare() {
        println("Preparing $name")
        dough = pizzaIngredientFactory.createDough()
        sauce = pizzaIngredientFactory.createSauce()
        cheese = pizzaIngredientFactory.createCheese()
        clam = pizzaIngredientFactory.createClam()
    }
}