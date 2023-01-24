package com.example.prework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*;
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // add change text to button
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Log.v("Button Event","button clicked")
            Toast.makeText(this,"Hello to you too",Toast.LENGTH_SHORT).show()
        }
    }

}