package ar.edu.ort.miprimeraplicacion.ui.components


sealed class Screen(val route: String) {
    object Welcome : Screen("welcome")
    object Login : Screen("login")
    object Register : Screen("register")
}