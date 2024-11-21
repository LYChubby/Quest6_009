package com.example.latihan6navigasilanjut.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.latihan6navigasilanjut.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {
    private val _mahasiswaState = MutableStateFlow(Mahasiswa())
    val mahasiswaStateUi : StateFlow<Mahasiswa> = _mahasiswaState.asStateFlow()


}