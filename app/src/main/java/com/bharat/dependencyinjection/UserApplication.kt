package com.bharat.dependencyinjection

import android.app.Application
import dagger.Component

class UserApplication: Application() {

    lateinit var userRegistrationComponent: UserRegistrationComponent
    override fun onCreate() {
        super.onCreate()
        userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(3)
    }
}