package com.example.plan_lector.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.plan_lector.R
import com.example.plan_lector.navigate.Route
import com.example.plan_lector.ui.theme.Plan_lectorTheme
import com.example.plan_lector.utils.SBottomBar
import com.example.plan_lector.utils.SMenu
import com.example.plan_lector.utils.itemView
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Index(navigationController: NavHostController) {
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    // Acción al hacer clic en el FAB
                    scope.launch {
                        snackbarHostState.showSnackbar("Home")
                    }
                }
            ) {
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = "Icono"
                )
            }
        },
        topBar = {
            TopAppBar(
                title = { Text(text = "Home") },
                actions = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        var isMenuOpen by remember {
                            mutableStateOf(false)
                        }
                        IconButton(onClick = { isMenuOpen = true }) {
                            Icon(
                                imageVector = Icons.Outlined.MoreVert,
                                contentDescription = null
                            )
                        }
                        SMenu(isMenuOpen, navigationController, itemClick = {
                            scope.launch {
                                snackbarHostState.showSnackbar(it)
                            }
                        }) { isMenuOpen = false }
                    }
                }
            )
        },
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Transparent)
            ) {
                HomeView(navigationController)
            }
        }
    )
}

@Composable
fun HomeView( navigationController: NavHostController) {
    val buttonLabels = listOf("Juegos", "Musica", "Películas", "Tecnologías", "Lugares")

    val buttonThemes = mapOf(
        "Juegos" to Color.Red,
        "Música" to Color.Yellow,
        "Películas" to Color.Green,
        "Tecnologías" to Color.Blue
    )

    val backgroundColor = Color(android.graphics.Color.parseColor("#22e6fe"))

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(20.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.rop),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent) // Establece el fondo transparente para la imagen
        )
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            buttonLabels.forEach { label ->
                Button(onClick = { navigationController.navigate(label) },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = backgroundColor
                    )) {
                    Text(label,
                        color = Color.Black,
                        modifier = Modifier.padding(vertical = 8.dp))
                }
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview2() {
    Plan_lectorTheme {
        Index( rememberNavController())
    }
}

