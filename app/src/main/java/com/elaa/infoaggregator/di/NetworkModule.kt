package com.elaa.infoaggregator.di

import com.elaa.infoaggregator.BuildConfig
import com.elaa.infoaggregator.utils.BaseUrl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn
class NetworkModule {

    @Provides
    @Singleton
    @Named(BaseUrl.POSTAL_CODE_URL)
    fun provideAppBaseUrl() = BuildConfig.BASE_URL

}