package patterns.factory.abstract_factory

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory{
    override fun createDough(): Dough = ThinCrustDough()

    override fun createSauce(): Sauce = PlumTomatoSauce()

    override fun createCheese(): Cheese = MozzarellaCheese()

    override fun createVeggies(): Array<Veggies> = arrayOf(BlackOlives(), Spinach(), Eggplant())

    override fun createPepperoni(): Pepperoni = SlicedPepperoni()

    override fun createClam(): Clams = FrozenClams()

}