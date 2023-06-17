package com.bharat.dependencyinjection

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

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