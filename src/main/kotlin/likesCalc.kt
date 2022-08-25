package ru.netology

class LikesCalc {
    companion object {
        fun likesToString(likes: Int): String {
            return when {
                likes.mod(100) == 11 -> "$likes людям"
                likes.mod(10) == 1 -> "$likes человеку"
                else -> "$likes людям"
            }
        }
    }
}