package com.example.movies.android

import android.app.Application
import com.example.movies.android.di.appModule
import com.example.movies.data.remote.di.getSharedModules
import org.koin.core.context.startKoin

class Movie: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule + getSharedModules())
        }
    }
}