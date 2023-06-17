package com.bharat.dependencyinjection

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser(email: String, password: String){
        Log.d("DaggerTest", "Saved user in db")
    }
}