package com.bharat.dependencyinjection

import android.util.Log

class UserRepository {
    fun saveUser(email: String, password: String){
        Log.d("DaggerTest", "Saved user in db")
    }
}