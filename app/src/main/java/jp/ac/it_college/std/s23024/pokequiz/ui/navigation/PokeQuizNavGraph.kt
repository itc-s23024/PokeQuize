package jp.ac.it_college.std.s23024.pokequiz.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import jp.ac.it_college.std.s23024.pokequiz.ui.generation.GenerationScreen
import jp.ac.it_college.std.s23024.pokequiz.ui.home.HomeScreen

@Composable
fun PokeQuizNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    navActions: PokeQuizNavigationActions = remember(navController) {
        PokeQuizNavigationActions(navController)
    }
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = PokeQuizDestinations.HOME_ROUTE
    ) {
        composable(
            route = PokeQuizDestinations.HOME_ROUTE
        ) {
            HomeScreen(
                onStartClick = {
                    navActions.navigateToGenerationSelect()
                }
            )
        }

        composable(
            route = PokeQuizDestinations.GENERATION_ROUTE
        ) {
            GenerationScreen()
        }
    }
}