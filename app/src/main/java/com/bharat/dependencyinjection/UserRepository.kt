package com.bharat.dependencyinjection

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    fun saveUser(email: String, password: String) {
        Log.d("DaggerTest", "Saved user in db")

    }


    @ApplicationScope
    class SQLRepository @Inject constructor(): UserRepository {
        override fun saveUser(email: String, password: String) {
            Log.d("DaggerTest", "Saved user in SQL")
        }
    }

    class FirebaseRepository : UserRepository{
        override fun saveUser(email: String, password: String) {
            Log.d("DaggerTest", "Saved user in Firebase")
        }
    }
}