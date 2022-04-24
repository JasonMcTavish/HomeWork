package `11_Generics_And_Utility_Classes`

import java.util.Stack

class Stack<T> {
    private var collection: Stack<T>? = null

    fun push(item: T) {
        collection?.add(item)
    }

    fun pop(): T? {
        return collection?.first()
    }

    fun isEmpty(): Boolean {
        return collection == null
    }
}