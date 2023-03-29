package com.adoyo.wastesort.domain.model

data class Prediction(
    val image: String,
    val threshold: Double,
    val modelId: String,
)

data class BoundingBox(
    val left: Float,
    val top: Float,
    val right: Float,
    val bottom: Float,
)
