package com.hariwr.praktikum12.ui.view

import com.hariwr.praktikum12.navigation.DestinasiNavigasi

object DestinasiUpdate : DestinasiNavigasi {
    override val route = "update"
    override val titleRes = "Update Mahasiswa"
    const val NIM = "nim"
    val routesWithArg = "$route/{$NIM}"
}