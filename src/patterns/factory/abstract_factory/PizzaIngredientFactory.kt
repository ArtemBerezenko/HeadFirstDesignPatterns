package patterns.factory.abstract_factory

interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): Array<Veggies>
    fun createPepperoni(): Pepperoni
    fun createClam(): Clams
}