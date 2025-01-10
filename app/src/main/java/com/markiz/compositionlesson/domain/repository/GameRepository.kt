package com.markiz.compositionlesson.domain.repository

import com.markiz.compositionlesson.domain.entity.GameSettings
import com.markiz.compositionlesson.domain.entity.Question
import com.markiz.compositionlesson.domain.entity.Level

interface GameRepository {

    fun getSettingGame(levelGame: Level) : GameSettings

    fun generateQuestion(maxSumValue: Int, countOfOption: Int): Question
}