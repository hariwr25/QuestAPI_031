package com.hariwr.praktikum12

import android.app.Application
import com.hariwr.praktikum12.container.AppContainer
import com.hariwr.praktikum12.container.MahasiswaContainer

class MahasiswaApplications : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}