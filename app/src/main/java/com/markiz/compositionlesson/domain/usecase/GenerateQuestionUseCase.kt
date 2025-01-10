package com.markiz.compositionlesson.domain.usecase

import com.markiz.compositionlesson.domain.entity.Question
import com.markiz.compositionlesson.domain.repository.GameRepository

class GenerateQuestionUseCase(private val repository: GameRepository) {

    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {
        const val COUNT_OF_OPTIONS = 6
    }

}
