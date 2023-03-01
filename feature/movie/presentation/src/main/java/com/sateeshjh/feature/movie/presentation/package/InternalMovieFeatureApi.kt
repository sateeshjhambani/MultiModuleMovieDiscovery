package com.sateeshjh.feature.movie.presentation.`package`

import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.sateeshjh.core.common.navigation_constants.MovieFeature
import com.sateeshjh.core.feature_api.FeatureApi

internal object InternalMovieFeatureApi: FeatureApi {
    override fun registerGraph(
        navController: androidx.navigation.NavHostController,
        navGraphBuilder: androidx.navigation.NavGraphBuilder
    ) {
        navGraphBuilder.navigation(startDestination = MovieFeature.movieScreenRoute, route = MovieFeature.nestedRoute) {
            composable(MovieFeature.movieScreenRoute) {
            }
        }
    }
}