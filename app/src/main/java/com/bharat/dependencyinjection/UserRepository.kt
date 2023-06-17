package com.bharat.dependencyinjection

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String) {
        Log.d("DaggerTest", "Saved user in db")

    }

    class SQLRepository @Inject constructor(): UserRepository {
        override fun saveUser(email: String, password: String) {
            Log.d("DaggerTest", "Saved user in SQL")
        }
    }

    class FirebaseRepository @Inject constructor(): UserRepository{
        override fun saveUser(email: String, password: String) {
            Log.d("DaggerTest", "Saved user in Firebase")
        }
    }
}