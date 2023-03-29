package com.adoyo.wastesort.data.remote

import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {
    @POST("run/predict")
    suspend fun predictGarbage(@Query("image") imageUrl: String): List<GarbageDto>
}