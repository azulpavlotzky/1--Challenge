package ar.edu.ort.miprimeraplicacion.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ar.edu.ort.miprimeraplicacion.ui.components.Screen
import ar.edu.ort.miprimeraplicacion.ui.screens.LoginScreen
import ar.edu.ort.miprimeraplicacion.ui.screens.RegisterScreen
import ar.edu.ort.miprimeraplicacion.ui.screens.WelcomeScreen

/**
 * TODO: document your custom view class.
 */
@Composable
fun Nav(navController: NavHostController) {
    NavHost(navController, startDestination = Screen.Welcome.route) {
        composable(Screen.Welcome.route) { WelcomeScreen(navController) }
        composable(Screen.Login.route) { LoginScreen(navController) }
        composable(Screen.Register.route) { RegisterScreen(navController) }

    }
}