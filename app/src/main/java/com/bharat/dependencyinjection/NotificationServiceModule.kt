package com.bharat.dependencyinjection

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule {

    @Singleton
   @MessageQualifier
    @Provides
    fun getMessageService(retryCount: Int): NotificationService {
        return NotificationService.MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(): NotificationService {
        return NotificationService.EmailService()
    }
}