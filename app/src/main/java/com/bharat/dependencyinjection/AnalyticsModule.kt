package com.bharat.dependencyinjection

import dagger.Module
import dagger.Provides

@Module
class AnalyticsModule {

    @Provides
    fun getAnalyticsService(): AnalyticsService {
        return Mixpanel()
    }
}