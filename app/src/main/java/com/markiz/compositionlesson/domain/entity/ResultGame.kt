package com.markiz.compositionlesson.domain.entity

data class ResultGame (
    val winner: Boolean,
    val countRightAnswer: Int,
    val countOfQuestions: Int,
    val gameSettings: Level
)