package com.bharat.dependencyinjection

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule {

    @ApplicationScope 
    @Binds
   abstract fun getSQLRepository(sqlRepository: UserRepository.SQLRepository) : UserRepository

}