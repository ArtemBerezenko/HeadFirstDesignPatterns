package patterns.composite

import java.util.*

class CompositeIterator(val iterator: Iterator<MenuComponent>) : Iterator<MenuComponent> {
    private val stack = Stack<Iterator<MenuComponent>>()

    init {
        stack.push(iterator)
    }

    override fun hasNext(): Boolean {
        return if (stack.isEmpty()) false
        else {
            val iterator = stack.peek()
            if (!iterator.hasNext()) {
                stack.pop()
                hasNext()
            } else true
        }
    }

    override fun next(): MenuComponent {
        if (hasNext()) {
            val iterator = stack.peek()
            val component = iterator.next()
            if (component is Menu)
                stack.push(component.createIterator())
            return component
        } else {
            throw NoSuchElementException()
        }
    }
}