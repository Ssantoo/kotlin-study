package com.lannstark.lec04

fun main(){
    val money1 = JavaMoney(2_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    if (money1 > money2){
        println("money1가 비쌈")
    }

    println(money1 === money3)


    if(fun1() || fun2()){
        println("본문")
    }


}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun2")
    return false
}