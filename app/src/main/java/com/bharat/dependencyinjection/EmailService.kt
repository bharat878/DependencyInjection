package com.bharat.dependencyinjection

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor(){
    fun send(to:String, from:String, body: String){
        Log.d("DaggerTest", "Email Sent")
    }
}