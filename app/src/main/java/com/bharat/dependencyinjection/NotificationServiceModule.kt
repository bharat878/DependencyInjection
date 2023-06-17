package com.bharat.dependencyinjection

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

   @MessageQualifier
    @Provides
    fun getMessageService(): NotificationService {
        return NotificationService.MessageService()
    }

    @Named("email")
    @Provides
    fun getEmailService(): NotificationService {
        return NotificationService.EmailService()
    }
}