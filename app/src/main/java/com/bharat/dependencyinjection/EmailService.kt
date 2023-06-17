package com.bharat.dependencyinjection

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.util.Log

class EmailService {
    fun send(to:String, from:String, body: String){
        Log.d("DaggerTest", "Email Sent")
    }
}