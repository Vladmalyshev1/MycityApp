package com.example.mycityapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mycityapp.R
import com.example.mycityapp.data.models.Place

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlaceDetailScreen(navController: NavHostController, place: Place?) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = place?.name ?: "Ошибка",
                        fontWeight = FontWeight.Bold,
                        fontSize = 32.sp
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Image(
                            painterResource(id = R.drawable.back),
                            contentDescription = "Назад",
                            contentScale = ContentScale.Fit
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        HorizontalDivider(thickness = 1.dp, color = Color.Black)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            place?.let {
                Image(
                    painter = painterResource(id = it.imageRes),
                    contentDescription = it.name,
                    modifier = Modifier.size(350.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = it.description, fontSize = 18.sp)
            } ?: Text("Информация отсутствует")
        }
    }
}