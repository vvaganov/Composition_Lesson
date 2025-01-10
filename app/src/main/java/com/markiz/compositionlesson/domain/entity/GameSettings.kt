package com.markiz.compositionlesson.domain.entity

data class  GameSettings (
    val maxSumValue: Int,
    val minCountRightAnswer: Int,
    val minPercentRightAnswer: Int,
    val gameTimeInSeconds: Int
)


