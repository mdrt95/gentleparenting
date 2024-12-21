package com.example.gpa

// MainActivity.kt
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gpa.screens.LessonScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GentleParentTheme {
                GentleParentApp()
            }
        }
    }
}

@Composable
fun GentleParentApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {}
        composable("lesson/{lessonId}") { backStackEntry ->
            LessonScreen(
                lessonId = backStackEntry.arguments?.getString("lessonId") ?: "1",
                navController = navController
            )
        }
    }
}






@Composable
fun GentleParentTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        content = content
    )
}

