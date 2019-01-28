package patterns.factory

class NYStylePepperoniPizza(
        override var name: String = "NY Style Pepperoni Pizza",
        override var dough: String = "Thin Crust Dough",
        override var sauce: String = "Marinara Sauce",
        override var toppings: ArrayList<String> = arrayListOf("Grated Reggiano Cheese",
                "Sliced Pepperoni", "Garlic", "Onion", "Mushrooms", "Red Pepper")
) : Pizza()
