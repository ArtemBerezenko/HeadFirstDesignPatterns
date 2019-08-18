package patterns.composite

import java.lang.UnsupportedOperationException

abstract class MenuComponent {

    open fun add(menuComponent: MenuComponent): Any = throw UnsupportedOperationException()

    open fun remove(menuComponent: MenuComponent): Any = throw UnsupportedOperationException()

    open fun getChild(i: Int): MenuComponent = throw UnsupportedOperationException()

    open fun print(): Unit = throw UnsupportedOperationException()

    abstract fun createIterator(): Iterator<MenuComponent>

    open fun isVegetarian(): Boolean = throw UnsupportedOperationException()
}