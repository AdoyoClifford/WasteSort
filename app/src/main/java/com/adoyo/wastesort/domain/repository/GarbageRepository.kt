package com.adoyo.wastesort.domain.repository

import com.adoyo.wastesort.domain.model.Prediction

interface GarbageRepository {
    suspend fun predictGarbage(imageUrl: String): List<Prediction>
}