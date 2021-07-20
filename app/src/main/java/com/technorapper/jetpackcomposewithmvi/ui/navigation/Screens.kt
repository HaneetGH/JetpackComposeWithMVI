package com.technorapper.jetpackcomposewithmvi.ui.navigation

sealed class Screens(val route: String) {
    object MainScreen : Screens("main_screen")
    object Detailcreen : Screens("detail_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { append("/$it") }
        }
    }
}
