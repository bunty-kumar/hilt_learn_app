package com.bunty.hilt_example_app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class UserApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}