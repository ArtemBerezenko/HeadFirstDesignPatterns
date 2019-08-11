package patterns.iterator

import kotlin.collections.Iterator

interface Menu {
    fun createIterator(): MutableIterator<MenuItem>
}