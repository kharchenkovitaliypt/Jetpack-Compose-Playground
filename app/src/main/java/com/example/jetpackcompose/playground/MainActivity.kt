package com.example.jetpackcompose.playground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.jetpackcompose.playground.ui.JetpackComposePlaygroundTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposePlaygroundTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = Color.Red, shape = RoundedCornerShape(4.dp)) {
                    Playground("Android")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposePlaygroundTheme {
        Playground("Runner")
    }
}

@Composable
fun Playground(text: String) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Image(
            asset = imageResource(R.drawable.header),
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillHeight
        )
        Text("$text**", Modifier.padding(top = 8.dp))
        Text("$text++")
    }
}