package com.camila.baseapp.di

import com.camila.baseapp.service.SampleService
import com.camila.baseapp.service.SampleServiceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HiltModule {

    @Singleton
    @Provides
    fun provideService(): SampleService {
        return SampleServiceImpl()
    }

}