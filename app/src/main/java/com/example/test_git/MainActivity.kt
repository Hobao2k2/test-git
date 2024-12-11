package com.example.test_git

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.test_git.ui.theme.TestgitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestgitTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Hello abc  $name!",
            modifier = modifier
        )
        Text(
            text = "Hello xyz  $name!",
            modifier = modifier
        )
        Text(
            text = "Hello www  $name!",
            modifier = modifier
        )
        Text(
            text = "Hello www  $name!"
        )
        Text(
            text = "Hello www  $name!"
        )
        Text(
            text = "Hello dungtd  $name!"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TestgitTheme {
        Greeting("Android")
    }
}