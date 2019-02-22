package patterns.factory.factory_method

class NYStyleVeggiePizza(
        override var name: String = "NY Style Veggie Pizza\n",
        override var dough: String = "Thin Crust Dough\n",
        override var sauce: String = "Veggie Sauce\n",
        override var toppings: ArrayList<String> = arrayListOf("Grated Reggiano Cheese ",
                "Garlic ", "Onion ", "Mushrooms ", "Red Pepper ")
) : Pizza() {
    override fun cut() = print("Cutting the pizza into square slices\n")
}
