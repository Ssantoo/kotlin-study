package com.lannstark.lec02

import java.lang.IllegalArgumentException

fun main(){
    val str: String? = null
    println(str?.length)
    //null

    /////

    println(str?.length ?: 0)
    //0

}

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null 들어옴")
    }
    return str.startsWith("A")
}
//좀더 코틀린스럽게
fun startsWithA1_1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null 들어옴")
}



fun startsWithA2(str: String?): Boolean? {
    if(str == null) {
        return null
    }
    return str.startsWith("A")
}
//좀더 코틀린 스럽게
fun startsWithA2_1(str: String?): Boolean? {
    return str?.startsWith("A")
}



fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}
//좀더 코틀린 스럽게
fun startsWithA3_1(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}


///// null이 무조건 아닐때
fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}