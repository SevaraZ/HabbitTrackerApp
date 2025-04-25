package com.sevara.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "habits")
data class HabitEntity (
    @PrimaryKey(autoGenerate = true)
    val id:Int  = 0,
    val name:String,
    val description: String?,
    val isActive: Boolean = false,
    val priority: Int = 0
    )