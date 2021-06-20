package com.technorapper.jetpackcomposewithmvi.ui.search

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.technorapper.jetpackcomposewithmvi.DefaultPreview
import com.technorapper.jetpackcomposewithmvi.ui.base.BaseActivity
import com.technorapper.jetpackcomposewithmvi.ui.theme.JetpackComposeWithMVITheme
import com.technorapper.jetpackcomposewithmvi.utils.Path

class SearchActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { drawNavigationView() }
    }

    @Composable
    fun drawNavigationView() {
        JetpackComposeWithMVITheme {
            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = Path.Routes.REPO_NAME_SCREEN.route
            ) {
                composable(Path.Routes.REPO_NAME_SCREEN.route) {
                    drawSearchUI()

                }
            }

        }
    }

    @Composable
    fun drawSearchUI() {
        TODO("Not yet implemented")
    }


}