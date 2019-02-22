package patterns.factory.abstract_factory

class PepperoniPizza(private val ingredientFactory: PizzaIngredientFactory) : Pizza() {

    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        veggies = ingredientFactory.createVeggies()
        pepperoni = ingredientFactory.createPepperoni()
    }
}
