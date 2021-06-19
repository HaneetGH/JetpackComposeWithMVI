package com.technorapper.jetpackcomposewithmvi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.technorapper.jetpackcomposewithmvi.ui.theme.JetpackComposeWithMVITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeWithMVITheme {
        //Greeting("Android")

        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Hello World")
            Spacer(modifier  = Modifier.padding(top =5.dp))
            Button(onClick = { /*TODO*/ }) {

                Text(text = "click here")

            }

        }
            
        }
    }
