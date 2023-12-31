package com.bharat.dependencyinjection

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService {
    fun send(to: String, from: String, body: String)
    
    @ApplicationScope
    class EmailService @Inject constructor() : NotificationService {
        override fun send(to: String, from: String, body: String) {
            Log.d("DaggerTest", "Notification Sent")
        }
    }

    class MessageService (private val retryCount: Int) : NotificationService {
        override fun send(to: String, from: String, body: String) {
            Log.d("DaggerTest", "Message Sent- retry count $retryCount ")

        }
    }
}