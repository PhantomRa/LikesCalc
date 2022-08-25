package ru.netology

fun main() {
    println("Введите количество лайков:")
    val likes = readLine()?.toInt()

    println("Понравилось ${likes?.let { LikesCalc.likesToString(it) }}")
}