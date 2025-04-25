package com.sevara.di

import android.content.Context
import androidx.room.Room
import com.sevara.data.local.AppDatabase
import com.sevara.data.local.dao.HabitCompletionDao
import com.sevara.data.local.dao.HabitDao
import com.sevara.data.local.dao.NotificationDao
import com.sevara.data.local.dao.QuoteDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "habit_tracker_db"
        ).fallbackToDestructiveMigration().build()
    }

    @Provides
    fun provideHabitDao(db: AppDatabase): HabitDao = db.habitDao()

    @Provides
    fun provideHabitCompletionDao(db: AppDatabase): HabitCompletionDao = db.habitCompletionDao()

    @Provides
    fun provideQuoteDao(db: AppDatabase): QuoteDao = db.quoteDao()

    @Provides
    fun provideNotificationDao(db: AppDatabase): NotificationDao = db.notificationDao()
}
