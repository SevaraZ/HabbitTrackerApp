package com.sevara.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.sevara.data.local.entity.NotificationEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface NotificationDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNotification(notification: NotificationEntity)

    @Query("SELECT * FROM notifications")
    fun getAllNotifications(): Flow<List<NotificationEntity>>

    @Update
    suspend fun updateNotification(notification: NotificationEntity)

    @Delete
    suspend fun deleteNotification(notification: NotificationEntity)
}
