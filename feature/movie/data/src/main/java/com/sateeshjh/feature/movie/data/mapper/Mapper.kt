package com.sateeshjh.feature.movie.data.mapper

import com.sateeshjh.core.network.model.MovieListResponse
import com.sateeshjh.feature.movie.domain.model.Movie

fun MovieListResponse.toDomainMovieList(): List<Movie> {
    return this.results.map {
        Movie(it.poster_path)
    }
}