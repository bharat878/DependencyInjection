package com.bharat.dependencyinjection

import android.util.Log
import javax.inject.Named

interface AnalyticsService {
    fun trackEvent(eventName: String, eventType: String)
}

class Mixpanel: AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("DaggerTest", "MixPanel- $eventName - $eventType")
    }
}

class FirebaseAnalytics: AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("DaggerTest", "MixPanel- $eventName - $eventType")
    }

}