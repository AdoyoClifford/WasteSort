package com.adoyo.wastesort.data.repository

import com.adoyo.wastesort.domain.model.Prediction
import com.adoyo.wastesort.domain.repository.GarbageRepository

class GarbageRepositoryImpl: GarbageRepository {
    override suspend fun predictGarbage(imageUrl: String): List<Prediction> {
        TODO("Not yet implemented")
    }
}