package com.hariwr.praktikum12.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Mahasiswa (
    val nama: String,
    val nim: String,
    val kelas: String,
    val alamat: String,
    val angkatan: String,

    @SerialName("jenis_kelamin")
    val jenisKelamin: String
)
