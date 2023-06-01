package com.example.plan_lector

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.plan_lector.navigate.Route
import com.example.plan_lector.ui.theme.Plan_lectorTheme

@Composable
fun Index(name: String, navigationController: NavHostController) {
    val buttonLabels = listOf("Juegos", "Música", "Películas", "Tecnologías")

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
        Index("Android", rememberNavController())
    }
}

