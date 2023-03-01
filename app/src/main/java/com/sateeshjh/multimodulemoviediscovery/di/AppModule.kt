package com.sateeshjh.multimodulemoviediscovery.di

import com.sateeshjh.feature.movie.presentation.`package`.MovieApi
import com.sateeshjh.multimodulemoviediscovery.navigation.NavigationProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideNavigationProvider(movieApi: MovieApi): NavigationProvider {
        return NavigationProvider(movieApi)
    }
}