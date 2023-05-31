package com.lannstark.lec01

fun main(){
    var number1 = 10L
    var number3: Long = 10L

    number1 = 5L
    println(number1)
    val number2 = 10L
    //number2 = 5L

    var number4: Long? = 1_000L
    number4 = null
    var person = Person("조현재")
}