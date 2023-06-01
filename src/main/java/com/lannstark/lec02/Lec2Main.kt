package com.lannstark.lec02

import java.lang.IllegalArgumentException

fun main(){
    val str: String? = null
    println(str?.length)

    
}

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null 들어옴")
    }
    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    if(str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}