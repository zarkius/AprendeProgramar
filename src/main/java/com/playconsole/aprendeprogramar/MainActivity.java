package com.playconsole.aprendeprogramar;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Missing closing brace here!

    int myVariable = 10; // This is outside of a method, but inside the class

    protected void onCreate(Bundle savedInstanceState) { // Error here!
        super.onCreate(savedInstanceState);
        // ... rest of your code ...
    }
}