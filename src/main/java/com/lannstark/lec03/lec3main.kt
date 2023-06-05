package com.lannstark.lec03

fun main(){
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L

    printAgeIfPerson(Person("", 100))
}

fun printAgeIfPerson(obj: Any?) {
    if (obj is Person){
        val person = obj as Person
        println(person.age)
    }

    val person = obj as? Person
    println(person?.age)

}