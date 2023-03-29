package com.adoyo.wastesort.utils

import com.adoyo.wastesort.domain.model.Prediction

data class PredictResponse(
    val success: Boolean,
    val predictions: List<Prediction>
)
