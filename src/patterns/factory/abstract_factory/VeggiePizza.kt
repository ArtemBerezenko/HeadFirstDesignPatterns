package patterns.factory.abstract_factory

class VeggiePizza(private val ingredientFactory: PizzaIngredientFactory) : Pizza() {

    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        veggies = ingredientFactory.createVeggies()
    }
}
