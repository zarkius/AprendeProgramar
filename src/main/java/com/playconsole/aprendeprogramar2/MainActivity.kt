package com.playconsole.aprendeprogramar2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

/**
 * The main activity of the application.
 *
 * This class serves as the entry point for the app's user interface.
 * It sets up the initial UI content using Jetpack Compose and handles
 * basic lifecycle events.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val string = "Hola Mundo"
        enableEdgeToEdge()
        setContent {

            // Your app's UI content goes here
        }
    }
}

