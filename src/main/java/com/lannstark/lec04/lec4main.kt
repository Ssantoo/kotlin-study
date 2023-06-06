package com.lannstark.lec04

fun main(){
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2){
        println("money1가 비쌈")
    }
}