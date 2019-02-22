package patterns.factory.factory_method

abstract class PizzaStore {
    fun orderPizza(type: String) = createPizza(type)?.apply {
        prepare()
        bake()
        cut()
        box()
    }

    abstract fun createPizza(type: String): Pizza?
}