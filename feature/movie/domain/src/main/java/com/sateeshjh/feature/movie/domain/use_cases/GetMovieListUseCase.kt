package com.sateeshjh.feature.movie.domain.use_cases

import com.sateeshjh.core.common.UiEvent
import com.sateeshjh.feature.movie.domain.model.Movie
import com.sateeshjh.feature.movie.domain.repository.MovieRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetMovieListUseCase @Inject constructor(private val movieRepository: MovieRepository) {

    operator fun invoke(apiKey: String, query: String) = flow<UiEvent<List<Movie>>> {
        emit(UiEvent.Loading())
        emit(UiEvent.Success(movieRepository.getMovieList(apiKey, query)))
    }.catch {
        emit(UiEvent.Error(it.message.toString()))
    }.flowOn(Dispatchers.IO)
}