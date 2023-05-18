package com.example.plan_lector

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(20.dp)) {
        Card(
        ) {
            Image(painter = painterResource(id = R.drawable.background), contentDescription = null)
            Column(modifier = Modifier.padding(10.dp)) {
                Text("AB CDE", fontWeight = FontWeight.W700)
                Text("+0 12345678")
                Text("XYZ city", fontWeight = FontWeight.W300)
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

