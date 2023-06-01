package com.example.plan_lector

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.twotone.Person
import androidx.compose.material.icons.twotone.MoreVert
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.plan_lector.navigate.Route
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import kotlinx.coroutines.launch

@Composable
fun itemView(item: Item, isDetail: Boolean) {
    Card(
        modifier = Modifier
            .padding(16.dp).fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = item.photo),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                contentScale = ContentScale.Crop
            )
            TextWithIcon(
                text = item.name,
                icon = painterResource(id = R.drawable.videogame_asset_fill0_wght400_grad0_opsz48),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(top = 16.dp)
            )
            Text(
                text = item.description,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 8.dp)
            )
            if (isDetail){
                Text(
                    text = "¿Donde aparece?",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top = 16.dp)
                )
                TextWithIcon(
                    text = item.whereAppear,
                    icon = painterResource(id = R.drawable.idea_icon),
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }
        }
    }
}

@Composable
fun TextWithIcon(
    text: String,
    icon: Painter,
    fontWeight: FontWeight,
    fontSize: TextUnit,
    modifier: Modifier = Modifier
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = icon,
            contentDescription = null,
            modifier = Modifier.size(50.dp).padding(top = 16.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = text,
            fontWeight = fontWeight,
            fontSize = fontSize,
            modifier = modifier
        )
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun itemIndex(navigationController: NavHostController, itemList: List<Item>, isDetail: Boolean = false){

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
            LazyColumn(verticalArrangement = Arrangement.spacedBy(16.dp), horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(bottom = 100.dp)) {
                item {
                    Spacer(modifier = Modifier.height(50.dp))
                }
                itemsIndexed(itemList) { index, item ->
                    itemView(item, isDetail)
                }

            }
        }
    )
}

@Composable
fun SMenu(
    isOpen: Boolean,
    navigationController: NavHostController,
    itemClick: (String) -> Unit,
    onClose: () -> Unit
) {
    val itemsMenu = listOf(Route.Index, Route.Screen2, Route.Screen3, Route.Screen4)

    DropdownMenu(expanded = isOpen, onDismissRequest = { onClose() }) {
        itemsMenu.forEach {
            DropdownMenuItem(onClick = {
                navigationController.navigate(it.route)
                itemClick(it.route)
                onClose()
            },
                text = { Text(text = it.route) })

        }
    }
}


@Composable
fun SBottomBar(navController: NavHostController) {
    val items = listOf(
        Route.Screen2,
        Route.Screen3,
        Route.Screen4
    )
    BottomAppBar(Modifier.padding(top = 100.dp)) {
        var index by remember { mutableStateOf(0) }

        items.forEachIndexed { i, screen ->
            NavigationBarItem(
                selected = screen.route == navController.currentDestination?.route,
                onClick = {
                    index = i
                    navController.navigate(screen.route)
                },
                icon = { Icon(imageVector = Icons.TwoTone.Person, contentDescription = null) },
                label = { Text(text = screen.route) }
            )
        }
    }
}


