package patterns.factory.abstract_factory

class NYPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough = ThinCrustDough()

    override fun createSauce(): Sauce = MarinaraSauce()

    override fun createCheese(): Cheese = ReggianoCheese()

    override fun createVeggies(): Array<Veggies> = arrayOf(Garlic(), Onion(), Mushroom(), RedPepper())

    override fun createPepperoni(): Pepperoni = SlicedPepperoni()

    override fun createClam(): Clams = FreshClams()
}