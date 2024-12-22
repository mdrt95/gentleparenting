package com.example.gpa.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gpa.R
import com.example.gpa.components.LearningPath

@Composable
fun HomeScreen() {
    //var streakCount by remember { mutableStateOf(0) }
    //var points by remember { mutableStateOf(0) }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Image(
            painter = painterResource(R.drawable.gpa_home_background),
            contentDescription = "Home Screen Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()

        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.Transparent),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Points: ")
            Text(text = "Streak: ")
        }

        LearningPath(
            title = "Managing Big Emotions",
            progress = 0.75f,
            onClick = {  }
        )

        Spacer(modifier = Modifier.height(16.dp))

        LearningPath(
            title = "Setting Boundaries",
            progress = 0.5f,
            onClick = {  }
        )
    }
}

@Preview
@Composable
fun HomeScreenExample(){
    HomeScreen()
}