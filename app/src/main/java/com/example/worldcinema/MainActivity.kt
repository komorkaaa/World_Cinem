package com.example.worldcinema

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_WorldCinema) //
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}