package com.sateeshjh.core.network.di

import com.sateeshjh.core.network.ApiService
import com.sateeshjh.core.network.Constants
import com.sateeshjh.core.network.dataProviders.MovieDataProviders
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {
    @Provides
    fun provideApiService(): ApiService {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiService::class.java)
    }

    @Provides
    fun provideMovieDataProvider(apiService: ApiService): MovieDataProviders {
        return MovieDataProviders(apiService)
    }
}