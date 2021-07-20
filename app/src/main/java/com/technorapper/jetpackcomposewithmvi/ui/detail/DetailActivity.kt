package com.technorapper.jetpackcomposewithmvi.ui.detail

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.technorapper.jetpackcomposewithmvi.DefaultPreview
import com.technorapper.jetpackcomposewithmvi.ui.base.BaseActivity
import com.technorapper.jetpackcomposewithmvi.ui.base.BaseComposeActivity
import com.technorapper.jetpackcomposewithmvi.ui.theme.JetpackComposeWithMVITheme
import com.technorapper.jetpackcomposewithmvi.utils.Path

class DetailActivity() : BaseComposeActivity() {
    var string = ""

    constructor(navController: String) : this() {
        string = navController
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { drawNavigationView("string") }
    }


    @Composable
    fun drawNavigationView(navController: String) {
        JetpackComposeWithMVITheme {
            Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
                Text(text = "Hello $navController")
            }

        }
    }


    @Composable
    fun drawSearchUI() {
        JetpackComposeWithMVITheme {

            Column(modifier = Modifier.background(Color.White)) {

                repoEditText()
                Spacer(modifier = Modifier.padding(top = 10.dp))
                repoButton();
            }
        }
    }

    @Composable
    fun repoButton() {
        Column(Modifier.padding(16.dp)) {
            Button(onClick = { /*TODO*/ }) {
                Text("Search", color = Color.White)
            }
        }
    }

    @Composable
    fun repoEditText() {
        Column(Modifier.padding(16.dp)) {
            val textState = remember { mutableStateOf(TextFieldValue()) }
            TextField(
                value = textState.value,
                onValueChange = { textState.value = it }
            )
            Text("The textfield has this text: " + textState.value.text)
        }
    }
}