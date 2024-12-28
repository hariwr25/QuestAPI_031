package com.hariwr.praktikum12.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hariwr.praktikum12.repository.MahasiswaRepository

class InsertViewModel(private val mhs: MahasiswaRepository) : ViewModel() {
    var uiState by mutableStateOf(InsertUiState())
        private set


    fun updateInsertMhsState(insertUiEvent: InsertUiEvent) {
        uiState = InsertUiState(insertUiEvent = insertUiEvent)
    }


    suspend fun insertMhs() {
        viewModelScope.launch {
            try {
                mhs.insertMahasiswa(uiState.insertUiEvent.toMhs())
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}