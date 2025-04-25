package com.sevara.di.repository

import com.sevara.data.local.dao.HabitCompletionDao
import com.sevara.data.local.entity.HabitCompletionEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HabitCompletionRepository @Inject constructor(
    private val habitCompletionDao: HabitCompletionDao
) {
    fun getCompletionsForDate(date: String): Flow<List<HabitCompletionEntity>> =
        habitCompletionDao.getCompletionsForDate(date)

    suspend fun insert(completion: HabitCompletionEntity) = habitCompletionDao.insert(completion)

    suspend fun update(completion: HabitCompletionEntity) = habitCompletionDao.update(completion)

    suspend fun delete(completion: HabitCompletionEntity) = habitCompletionDao.delete(completion)
}