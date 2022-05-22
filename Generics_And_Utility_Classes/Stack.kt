package Generics_And_Utility_Classes


class Stack<T>(){
    var collection = mutableListOf<T>()
    fun push(item:T){
        collection.add(0,item)
    }
    fun pop():T{
        return collection.removeAt(0)
    }
    fun isEmpty():Boolean{
        return collection.indices == 0 downTo -1
    }
}