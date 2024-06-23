package com.example.kotlinprogramming

class MobilePhone(osName: String, brand: String, model: String){
    var battary: Int = 20
    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }
    fun chargeBattary(value:Int) {

        println("Mobile had battery ${battary}, that is charged by ${value}")
        battary = if(battary + value > 100) 100 else battary+ value
        println("Now the battery is $battary")
    }
}
class Person (fName: String, sName: String){
    lateinit var firstName:String
    lateinit var secondName:String
    var age:Int = 0
        get() {
            println("Age getter is being called")
            return field
        }
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Age cannot be negative")
        }
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
    var mobile1:MobilePhone = MobilePhone("Android", "Vivo", "Y12")
    mobile1.chargeBattary(50)
}
