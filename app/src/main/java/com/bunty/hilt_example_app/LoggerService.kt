package com.bunty.hilt_example_app

import android.util.Log
import com.bunty.hilt_example_app.Constants.TAG
import javax.inject.Inject

class LoggerService @Inject constructor() {
    fun log(message: String) {
        Log.d(TAG, message)
    }
}