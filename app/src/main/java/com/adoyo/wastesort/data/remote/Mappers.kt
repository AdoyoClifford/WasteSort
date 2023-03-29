package com.adoyo.wastesort.data.remote

import com.adoyo.wastesort.domain.model.Prediction

fun GarbageDto.toPrediction(): Prediction {
    return Prediction(
        image = image,
        threshold = threshold,
        modelId = model_id,
    )
}