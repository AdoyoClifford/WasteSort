package com.adoyo.wastesort.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.adoyo.wastesort.domain.model.Prediction
import com.adoyo.wastesort.domain.repository.GarbageRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GarbageViewModel @Inject constructor(
    private val garbageRepository: GarbageRepository
): ViewModel() {

    private val _predictions = MutableStateFlow<List<Prediction>>(emptyList())
    val predictions: StateFlow<List<Prediction>>
    get() = _predictions

    fun predictData(imageUrl: String) {
        viewModelScope.launch {
            _predictions.value = garbageRepository.predictGarbage(imageUrl)
        }
    }
}