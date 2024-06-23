package com.example.kotlinprogramming

fun main() {
    var nonNullable:String = "Muhammad"
  //  nonNullable = null          GIVES AN ERROR MESSAGE BECAUSE WE CAN'T ASSIGN NULL TO NONNULLABLE
    var nullable:String? = "Rehan"
    //nullable = null
    nonNullable = nullable ?: "Name"
    println("NonNullable name is $nonNullable")
}

fun average(a: Double, b:Double): Double {
    val ave:Double
    ave = a+b/2
    return ave
}