package com.adoyo.wastesort.data.repository

import com.adoyo.wastesort.data.remote.ApiService
import com.adoyo.wastesort.data.remote.toPrediction
import com.adoyo.wastesort.domain.model.Prediction
import com.adoyo.wastesort.domain.repository.GarbageRepository

class GarbageRepositoryImpl(private val service: ApiService): GarbageRepository {
    override suspend fun predictGarbage(imageUrl: String): List<Prediction> {
        val response = service.predictGarbage(imageUrl)
        return response.map { it.toPrediction() }
    }
}