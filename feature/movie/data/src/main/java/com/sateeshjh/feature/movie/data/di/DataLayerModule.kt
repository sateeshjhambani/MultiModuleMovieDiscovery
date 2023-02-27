package com.sateeshjh.feature.movie.data.di

import com.sateeshjh.core.network.dataProviders.MovieDataProviders
import com.sateeshjh.feature.movie.data.repository.MovieRepositoryImpl
import com.sateeshjh.feature.movie.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DataLayerModule {

    @Provides
    fun provideMovieRepo(movieDataProviders: MovieDataProviders): MovieRepository {
        return MovieRepositoryImpl(movieDataProviders)
    }
}