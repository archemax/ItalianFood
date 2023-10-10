package com.ima.italianfood.presentation.navigation


import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.ima.italianfood.presentation.MainScreen
import com.ima.italianfood.presentation.Screens.OneRecipeScreen
import com.ima.italianfood.presentation.Screens.SplashScreen

@Composable
fun NavigationComponent() {
    val navController = rememberNavController()
    val toBackScreen = { navController.popBackStack() }
    val toOneRecipeScreen =
        { id: String -> navController.navigate("${Screen.ONE_RECIPE_SCREEN.name}/$id") }
    val configuration = LocalConfiguration.current

    NavHost(
        navController = navController,
        startDestination = Screen.SPLASH_SCREEN.name,
    ) {

        //MAIN SCREEN//////////////////////////////////////////////////////////////////////////////
        composable(
            route = Screen.MAIN_USER_SCREEN.name
        ) {
            MainScreen(
                configuration = Configuration(),
                toOneRecipeScreen = toOneRecipeScreen,
            )
        }
        /////////////////////////////////////////////////////////////////////////////////
        composable(
            route = "${Screen.ONE_RECIPE_SCREEN}/{id}",
            arguments = listOf(navArgument("id") { type = NavType.StringType })
        ) {
            val routeId = it.arguments?.getString("id").orEmpty()

            OneRecipeScreen(
                navController = navController,
                routeId = routeId

            )
        }
        ///SPLASH SCREEN/////////////////////////////////////////////////////////////////////
        composable(route = Screen.SPLASH_SCREEN.name){
            SplashScreen() {
                navController.navigate(Screen.MAIN_USER_SCREEN.name){
                    popUpTo(Screen.SPLASH_SCREEN.name){
                        inclusive = true
                    }
                }
            }
        }
    }
}


enum class Screen {
    MAIN_USER_SCREEN,
    ONE_RECIPE_SCREEN,
    SPLASH_SCREEN
}