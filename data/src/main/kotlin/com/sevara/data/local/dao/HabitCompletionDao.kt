package com.sevara.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.sevara.data.local.entity.HabitCompletionEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface HabitCompletionDao {
    @Query("SELECT * FROM habit_completions WHERE date = :date")
    fun getCompletionsForDate(date: String): Flow<List<HabitCompletionEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(completion: HabitCompletionEntity)

    @Update
    suspend fun update(completion: HabitCompletionEntity)

    @Delete
    suspend fun delete(completion: HabitCompletionEntity)
}