package com.hariwr.praktikum12.ui.viewmodel

import com.hariwr.praktikum12.data.Mahasiswa

sealed class HomeUiState {
    data class Success(val mahasiswa: List<Mahasiswa>) : HomeUiState()
    object Error : HomeUiState()
    object Loading : HomeUiState()
}
