package com.markiz.compositionlesson.domain.usecase

import com.markiz.compositionlesson.domain.entity.GameSettings
import com.markiz.compositionlesson.domain.entity.Level
import com.markiz.compositionlesson.domain.repository.GameRepository

class GetSettingsGameUseCase(private val repository: GameRepository) {

    operator fun invoke(levelGame: Level): GameSettings {
        return repository.getSettingGame(levelGame)

    }
}