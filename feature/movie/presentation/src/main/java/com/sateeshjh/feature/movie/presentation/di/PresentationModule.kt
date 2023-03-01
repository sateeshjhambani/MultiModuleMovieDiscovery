package com.sateeshjh.feature.movie.presentation.di

import com.sateeshjh.feature.movie.presentation.`package`.MovieApi
import com.sateeshjh.feature.movie.presentation.`package`.MovieApiImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object PresentationModule {

    @Provides
    fun provideMovieApi(): MovieApi {
        return MovieApiImpl()
    }
}