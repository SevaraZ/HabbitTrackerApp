package com.sevara.di.repository

import com.sevara.data.local.dao.QuoteDao
import com.sevara.data.local.entity.QuoteEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val quoteDao: QuoteDao
) {
    fun getLatestQuote(): Flow<QuoteEntity?> = quoteDao.getLatestQuote()

    suspend fun insert(quote: QuoteEntity) = quoteDao.insert(quote)

    suspend fun deleteOld(before: String) =quoteDao.deleteOldQuotes(before)
}