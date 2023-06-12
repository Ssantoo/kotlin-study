package com.lannstark.lec05

fun validateScoreIsNotNegative(score: Int){
   if (score <0){
       throw IllegalArgumentException("${score}는 0보다 작을 수 없다")
   }
}

fun getPassOrFail(score: Int): String {
    if (score >=50) {
        return "p"
    } else {
        return "f"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "c"
    } else {
        "d"
    }
}