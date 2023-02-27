package com.sateeshjh.feature.movie.data.repository

import com.sateeshjh.core.network.dataProviders.MovieDataProviders
import com.sateeshjh.feature.movie.data.mapper.toDomainMovieList
import com.sateeshjh.feature.movie.domain.model.Movie
import com.sateeshjh.feature.movie.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val movieDataProviders: MovieDataProviders): MovieRepository {

    override suspend fun getMovieList(apiKey: String, query: String): List<Movie> {
        return movieDataProviders.getMovieList(apiKey, query).toDomainMovieList()
    }
}