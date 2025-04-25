package com.sevara.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sevara.data.local.entity.QuoteEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface QuoteDao {
    @Query("SELECT * FROM quotes ORDER BY dateReceived DESC LIMIT 1")
    fun getLatestQuote(): Flow<QuoteEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(quote: QuoteEntity)

    @Query("DELETE FROM quotes WHERE dateReceived < :olderThan")
    suspend fun deleteOldQuotes(olderThan: String)
}

