package patterns.composite

class NullIterator : Iterator<MenuComponent> {
    override fun hasNext(): Boolean = false

    override fun next(): MenuComponent = throw UnsupportedOperationException()
}