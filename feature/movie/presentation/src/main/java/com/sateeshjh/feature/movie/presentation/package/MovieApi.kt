package com.sateeshjh.feature.movie.presentation.`package`

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.sateeshjh.core.feature_api.FeatureApi

interface MovieApi: FeatureApi {


}

class MovieApiImpl: MovieApi {
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        InternalMovieFeatureApi.registerGraph(
            navController, navGraphBuilder
        )
    }
}