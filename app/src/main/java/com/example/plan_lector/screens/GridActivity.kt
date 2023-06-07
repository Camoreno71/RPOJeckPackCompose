package com.example.plan_lector.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material3.Card
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
import androidx.compose.ui.draw.clip
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
import kotlinx.coroutines.launch


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun NarutoCharacterGrid(navigationController: NavHostController) {
    val characters = listOf(
        Character(R.drawable.naruto, "naruto"),
        Character(R.drawable.sasuke, "sasuke"),
        Character(R.drawable.sakura, "sakura"),
        Character( R.drawable.kakashi, "kakashi"),
        Character( R.drawable.shikamaru, "Shikamaru"),
        Character(R.drawable.rock_lee, "Rock lee")
    )

    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    scope.launch {
                        snackbarHostState.showSnackbar("Actividad Grid")
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
                title = { Text(text = "Actividad Grid") },
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
                        IconButton(onClick = {
                            // Acción al hacer clic en el icono (volver a home)
                            navigationController.navigate(Route.Index.route)
                        }) {
                            Icon(
                                imageVector = Icons.Default.Home,
                                contentDescription = "Volver a Home"
                            )
                        }

                        SMenu(isMenuOpen, navigationController, itemClick = {
                            scope.launch {
                                snackbarHostState.showSnackbar(it)
                            }
                        }) { isMenuOpen = false }
                    }
                },
            )
        },
        bottomBar = {  SBottomBar(navigationController) },
        content = {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(16.dp),
                modifier = Modifier.padding(top = 40.dp)

            ) {
                itemsIndexed(characters) { _, character ->
                    CharacterCard(character = character)
                }
            }
        }
    )

}

@Composable
fun CharacterCard(character: Character) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .aspectRatio(1f)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = character.photo),
                contentDescription = character.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .height(120.dp)
                    .clip(shape = RoundedCornerShape(4.dp))
            )
        }
    }
}

data class Character(val photo: Int, val name:String)



@ExperimentalMaterial3Api
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GridPreview(){
    Plan_lectorTheme {
        NarutoCharacterGrid( rememberNavController())
    }
}