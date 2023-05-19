package com.codenesia.kopindo.ui.screen

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object About : Screen("about")
    object DetailKopi : Screen("home/{kopiId}") {
        fun createRoute(kopiId: String) = "home/$kopiId"
    }
}