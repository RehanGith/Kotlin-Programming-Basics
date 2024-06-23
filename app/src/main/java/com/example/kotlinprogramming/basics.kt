package com.example.kotlinprogramming


class Person (fName: String, sName: String){
    lateinit var firstName:String
    lateinit var secondName:String
    var age:Int = 0
    init {
        this.firstName = fName
        this.secondName = sName
        println("Primary constructor is being called")
    }
    constructor(fName: String, sName:String, age : Int ):this(fName, sName) {
        this.age = age
        println("Secondary Constructor is being called")
    }
    //Display Detail function which displays person detail
    fun displayDetail() {
        println("${this.firstName} second name is ${this.secondName}, has age ${this.age} ")
    }
}
fun main() {

    var person1 = Person("Muhammad", "Rehan", 20)
    person1.displayDetail()
}
