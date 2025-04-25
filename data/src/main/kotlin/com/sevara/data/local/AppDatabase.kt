package com.sevara.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sevara.data.local.dao.HabitCompletionDao
import com.sevara.data.local.dao.HabitDao
import com.sevara.data.local.dao.NotificationDao
import com.sevara.data.local.dao.QuoteDao
import com.sevara.data.local.entity.HabitCompletionEntity
import com.sevara.data.local.entity.HabitEntity
import com.sevara.data.local.entity.NotificationEntity
import com.sevara.data.local.entity.QuoteEntity

@Database(
    entities = [HabitEntity::class,
        HabitCompletionEntity::class,
        QuoteEntity::class,
        NotificationEntity::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun habitDao(): HabitDao
    abstract fun habitCompletionDao(): HabitCompletionDao
    abstract fun quoteDao(): QuoteDao
    abstract fun notificationDao(): NotificationDao
}
