package jp.ac.it_college.std.s23024.pokequiz.ui.navigation

import androidx.navigation.NavController
import jp.ac.it_college.std.s23024.pokequiz.ui.navigation.PokeQuizDestinationsArgs.CORRECT_ANSWER_COUNT_ARG
import jp.ac.it_college.std.s23024.pokequiz.ui.navigation.PokeQuizDestinationsArgs.GENERATION_ID_ARG
import jp.ac.it_college.std.s23024.pokequiz.ui.navigation.PokeQuizNavigation.GENERATION_SCREEN
import jp.ac.it_college.std.s23024.pokequiz.ui.navigation.PokeQuizNavigation.HOME_SCREEN
import jp.ac.it_college.std.s23024.pokequiz.ui.navigation.PokeQuizNavigation.QUIZ_SCREEN
import jp.ac.it_college.std.s23024.pokequiz.ui.navigation.PokeQuizNavigation.RESULT_SCREEN

private object PokeQuizNavigation{
    const val HOME_SCREEN = "home"
    const val GENERATION_SCREEN = "generation"
    const val QUIZ_SCREEN = "quiz"
    const val RESULT_SCREEN = "result"
}

object PokeQuizDestinationsArgs {
    const val GENERATION_ID_ARG = "generationId"
    const val CORRECT_ANSWER_COUNT_ARG = "correctCount"
}

object PokeQuizDestinations {
    const val HOME_ROUTE = HOME_SCREEN
    const val GENERATION_ROUTE = GENERATION_SCREEN
    const val QUIZ_ROUTE = "$QUIZ_SCREEN/{$GENERATION_ID_ARG}"
    const val RESULT_ROUTE = "$RESULT_SCREEN/{$CORRECT_ANSWER_COUNT_ARG}"
}

class PokeQuizNavigationActions(private val navController: NavController) {
    fun navigateToHome() {
        navController.navigate(PokeQuizDestinations.HOME_ROUTE)
    }

    fun navigateToGenerationSelect() {
        navController.navigate(PokeQuizDestinations.GENERATION_ROUTE)
    }

    fun navigateToQuiz(generationId: Int) {
        navController.navigate("$QUIZ_SCREEN/$generationId")
    }

    fun navigateToResult(count: Int) {
        navController.navigate("$RESULT_SCREEN/$count")
    }
}