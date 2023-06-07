package com.example.plan_lector.screens

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.plan_lector.R
import com.example.plan_lector.ui.theme.Plan_lectorTheme
import com.example.plan_lector.utils.SBottomBar
import com.example.plan_lector.utils.SMenu
import kotlinx.coroutines.launch



@Composable
fun aboutMeView() {
    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp), horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(bottom = 100.dp, top = 100.dp)
        ) {
            item {
                Image(
                    painter = painterResource(id = R.drawable.carlos_photo),
                    contentDescription = "Foto",
                    modifier = Modifier.size(200.dp).clip(shape = CircleShape)
                )
            }
            item {
                Text(
                    text = "GitHub",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    ),
                    modifier = Modifier.clickable {
                        val uri = Uri.parse("https://github.com/Camoreno71")
                        val intent = Intent(Intent.ACTION_VIEW, uri)
                        context.startActivity(intent)
                    }
                )
            }
            item {
                Text(
                    text = "Información",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                )
            }
            item {
                Text(
                    text = "Ingeniero de sistemas y computación con conocimiento y experiencia en desarrollo de software backend y frontend, en lenguajes como python por medio de frameworks como Django y Django Restframework, y javascript mediante frameworks tales como ReactJs. Manejo de bases de datos relacionales (PostgreSQL y Oracle) y no relacionales. Conocimiento en trabajo colaborativo por control de versiones por medio de git.",
                    textAlign = TextAlign.Center
                )
            }
            item {
                Text(
                    text = "Experiencia: 1 año (Desarrollador fullStack)",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                )
            }
        }
    }
}




@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun aboutMeIndex(navigationController: NavHostController){
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Plan lector") },
                actions = {
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
                },

                )
        },
        bottomBar = {  SBottomBar(navigationController) },
        content = {
            aboutMeView()
        }
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun aboutMePreview(){
    Plan_lectorTheme {
        aboutMeIndex( rememberNavController())
    }
}