package com.markiz.compositionlesson.data

import com.markiz.compositionlesson.domain.entity.GameSettings
import com.markiz.compositionlesson.domain.entity.Level
import com.markiz.compositionlesson.domain.entity.Question
import com.markiz.compositionlesson.domain.repository.GameRepository
import kotlin.math.max
import kotlin.math.min
import kotlin.random.Random

object GameRepositoryImpl : GameRepository {

    private const val MIN_SUM_VALUE = 2
    private const val MIN_ANSWER_VALUE = 1


    override fun getSettingGame(levelGame: Level): GameSettings {
        return when (levelGame) {
            Level.TEST -> {
                GameSettings(
                    10,
                    3,
                    50,
                    8
                )
            }

            Level.EASY -> {
                GameSettings(
                    10,
                    10,
                    70,
                    60
                )
            }

            Level.NORMAL -> {
                GameSettings(
                    20,
                    20,
                    80,
                    40
                )
            }

            Level.HARD -> {
                GameSettings(
                    30,
                    30,
                    90,
                    40,
                )
            }

        }
    }

    override fun generateQuestion(maxSumValue: Int, countOfOption: Int): Question {
        val sum = Random.nextInt(MIN_SUM_VALUE, maxSumValue + 1)
        val visibleNumber = Random.nextInt(MIN_ANSWER_VALUE, sum)
        val option = HashSet<Int>()
        val rightAnswer = sum - visibleNumber
        option.add(rightAnswer)
        val from = max(rightAnswer - countOfOption, MIN_ANSWER_VALUE)
        val to = min(maxSumValue, rightAnswer + countOfOption)
        while (option.size < countOfOption) {
            option.add(Random.nextInt(from, to))
        }

        return Question(sum, visibleNumber, option.toList())
    }
}