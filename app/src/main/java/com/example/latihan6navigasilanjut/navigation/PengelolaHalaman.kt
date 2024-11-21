package com.example.latihan6navigasilanjut.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.latihan6navigasilanjut.ui.view.viewmodel.MahasiswaViewModel
import com.example.latihan6navigasilanjut.ui.view.viewmodel.RencanaStudyViewModel

enum class Halaman {
    Splash,
    Mahasiswa,
    Matakuliah,
    Tampil
}

@Composable
fun PengelolaHalaman(
    modifier: Modifier = Modifier,
    viewModel: MahasiswaViewModel = viewModel(),
    viewModelMK: RencanaStudyViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {

}