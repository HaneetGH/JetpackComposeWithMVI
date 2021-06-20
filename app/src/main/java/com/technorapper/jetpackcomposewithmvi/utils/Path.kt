package com.technorapper.jetpackcomposewithmvi.utils

sealed class Path {
    enum class Routes(val route: String) {
        REPO_NAME_SCREEN("repo_name_screen"),
        REPO_LIST_SCREEN("repo_list_screen"),
    }

    enum class Params(val param: String) {
        DOMINANT_COLOR("dominantColor"),
        CHARACTER_ID("characterId"),
    }
}

