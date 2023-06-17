package com.bharat.dependencyinjection

import dagger.Component

@Component
interface UserRegistrationComponent {
    fun getUserRegistrationService() : UserRegistrationService
    fun getEmailService() : EmailService
}