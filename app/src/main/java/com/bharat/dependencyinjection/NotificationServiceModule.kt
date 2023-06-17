package com.bharat.dependencyinjection

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    @Provides
    fun getMessageService(): NotificationService {
        return NotificationService.MessageService()
    }
}