package com.bunty.hilt_example_app

import android.util.Log
import com.bunty.hilt_example_app.Constants.TAG
import javax.inject.Inject

interface UserRepository {
    fun saveUser(name: String, email: String)
}

class SqlRepository @Inject constructor() : UserRepository {
    override fun saveUser(name: String, email: String) {
        Log.d(TAG, "saved in db -$name - $email")
    }
}

class FirebaseRepository : UserRepository {
    override fun saveUser(name: String, email: String) {
        Log.d(TAG, "saved in firebase -$name - $email")
    }
}