package com.example.kotlinprogramming

fun main() {
//    println("Hello, World!")
//    for(i in 1..50 step 2) {
//        println(i)
//    }
//    var arr: Array<Int> = arrayOf(1,2,3,4,5)
//    for(i in arr) {
//        println(i)
//    }
    val arr:ArrayList<Int> = ArrayList()
//    for(i in 0..10) {
//        arr.add(i, 2*i)
//    }
//    arr?.let { nonNullArr ->
//        for(i in nonNullArr) {
//            println(i)
//        }
//
//    }
    var i = 1
    while(true) {
        arr.add(i)
        i++
        if(i == 10)
            break
    }
    arr?.let { nonNullArr ->
        for (j in nonNullArr) {
            println(j)
        }
    }
}