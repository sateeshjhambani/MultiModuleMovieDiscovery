package com.sateeshjh.core.network.dataProviders

import com.sateeshjh.core.network.ApiService
import javax.inject.Inject

class MovieDataProviders @Inject constructor(private val apiService: ApiService) {

    suspend fun getMovieList(apiKey: String, query: String) = apiService.getMovieList(apiKey, query)

}