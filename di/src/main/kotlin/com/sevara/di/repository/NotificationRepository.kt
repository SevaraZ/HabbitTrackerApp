package com.sevara.di.repository

import com.sevara.data.local.dao.NotificationDao
import com.sevara.data.local.entity.NotificationEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NotificationRepository @Inject constructor(
    private val notificationDao: NotificationDao
){
    fun getAllNotifications(): Flow<List<NotificationEntity>> = notificationDao.getAllNotifications()

    suspend fun insert(notification: NotificationEntity) = notificationDao.insertNotification(notification)

    suspend fun update(notification: NotificationEntity) = notificationDao.updateNotification(notification)

    suspend fun delete(notification: NotificationEntity) = notificationDao.deleteNotification(notification)
}