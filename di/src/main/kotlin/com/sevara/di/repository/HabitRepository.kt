package com.sevara.di.repository

import com.sevara.data.local.dao.HabitDao
import com.sevara.data.local.entity.HabitEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HabitRepository @Inject constructor(
    private val habitDao: HabitDao
) {
    fun getAllHabits(): Flow<List<HabitEntity>> = habitDao.getAllHabits()

    suspend fun insert(habit: HabitEntity) = habitDao.insert(habit)

    suspend fun update(habit: HabitEntity) = habitDao.update(habit)

    suspend fun delete(habit: HabitEntity) = habitDao.delete(habit)
}