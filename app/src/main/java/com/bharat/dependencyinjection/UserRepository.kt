package com.bharat.dependencyinjection

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    fun saveUser(email: String, password: String) {
        Log.d("DaggerTest", "Saved user in db")

    }


    @ApplicationScope
    class SQLRepository @Inject constructor(val analyticsService: AnalyticsService): UserRepository {
        override fun saveUser(email: String, password: String) {
            Log.d("DaggerTest", "Saved user in SQL")
            analyticsService.trackEvent("Save User", "Create")
        }
    }

    class FirebaseRepository(private val analyticsService: AnalyticsService) : UserRepository{
        override fun saveUser(email: String, password: String) {
            Log.d("DaggerTest", "Saved user in Firebase")
            analyticsService.trackEvent("Save User", "Create")
        }
    }
}