package Generics_And_Utility_Classes

import java.util.Stack

class Stack<T> {
     var collection= Stack<T>()

    fun push(item: T) {
        collection.push(item)
    }

    fun pop(): T {
        return collection.pop()
    }

    fun isEmpty(): Boolean {
        return collection == null
    }
}