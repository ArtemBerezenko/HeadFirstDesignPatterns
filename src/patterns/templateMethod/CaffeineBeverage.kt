package patterns.templateMethod

abstract class CaffeineBeverage {

    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        if (customerWantsCondiments()) {
            addCondiments()
        }
    }

    abstract fun addCondiments()

    abstract fun brew()

    private fun pourInCup() {
        println("Pouring into cup")
    }

    fun boilWater() {
        println("Boiling water")
    }

    open fun customerWantsCondiments() = true

}