package com.sateeshjh.feature.movie.domain.repository

interface MovieRepository {

    suspend fun getMovieList(apiKey: String, query: String): List<com.sateeshjh.feature.movie.domain.model.Movie>
}