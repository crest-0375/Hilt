package com.app.hilt

import android.util.Log
import javax.inject.Inject

const val TAG = "MY_TAG"

interface UserRepository {
    fun saveUser()
}

class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser() {
        Log.d(TAG, "User saved in DB!")
    }
}

class FirebaseRepository @Inject constructor() : UserRepository {
    override fun saveUser() {
        Log.d(TAG, "User saved in Firebase!")
    }
}