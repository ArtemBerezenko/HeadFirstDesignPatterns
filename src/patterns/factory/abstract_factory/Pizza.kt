package patterns.factory.abstract_factory

abstract class Pizza {
    var name: String = ""
    var dough: Dough? = null
    var sauce: Sauce? = null
    var veggies: Array<Veggies>? = null
    var cheese: Cheese? = null
    var pepperoni: Pepperoni? = null
    var clam: Clams? = null

    abstract fun prepare()

    fun bake() = println("Bake for 25 minutes at 350")
    
    fun cut() = println("Cutting the pizza into diagonal slices")
    
    fun box() = println("Place pizza in official PizzaStore box")

    override fun toString(): String =
            StringBuffer().apply {
                append("---- $name ----\n")
                appendString(this, dough)
                appendString(this, sauce)
                appendString(this, cheese)
                appendString(this, clam)
                appendString(this, pepperoni)

                if (veggies != null) {
                    for (i in veggies!!.indices) {
                        this.append(veggies!![i])
                        if (i < veggies!!.size - 1) {
                            this.append(", ")
                        }
                    }
                    this.append("\n")
                }
        }.toString()

    private fun appendString(result: StringBuffer, item: Any?) {
        if (item != null) {
            result.append(item.toString())
            result.append("\n")
        }
    }

}