package com.example.plan_lector

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.plan_lector.navigate.AppNavigation
import com.example.plan_lector.screens.Index
import com.example.plan_lector.ui.theme.Plan_lectorTheme

class MainActivity : ComponentActivity() {
    private lateinit var navigationController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Plan_lectorTheme {
                // A surface container using the 'background' color from the theme
                navigationController = rememberNavController()
                AppNavigation(navigationController = navigationController)

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Plan_lectorTheme {
        Index("Android", rememberNavController())
    }
}