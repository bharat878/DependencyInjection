package com.bharat.dependencyinjection

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.util.Log
import javax.inject.Inject

interface NotificationService {
    fun send(to: String, from: String, body: String)
    class EmailService @Inject constructor() : NotificationService {
        override fun send(to: String, from: String, body: String) {
            Log.d("DaggerTest", "Notification Sent")
        }
    }

    class MessageService @Inject constructor(): NotificationService {
        override fun send(to: String, from: String, body: String) {
            Log.d("DaggerTest", "Message Sent")

        }
    }
}