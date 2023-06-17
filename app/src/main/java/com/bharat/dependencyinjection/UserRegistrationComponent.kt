package com.bharat.dependencyinjection

import dagger.Component

@Component
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)
}