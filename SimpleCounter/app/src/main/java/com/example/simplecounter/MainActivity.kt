package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button);
        var counter = 99;
        var increment = 1;
        val textView = findViewById<TextView>(R.id.textView);
        val upgradeBtn = findViewById<Button>(R.id.upgradeBtn);
        button.setOnClickListener {

            counter+=increment;
            textView.text = counter.toString()
            if (counter >= 100 && !upgradeBtn.isVisible) {
                upgradeBtn.visibility = View.VISIBLE
            }
        }
        upgradeBtn.setOnClickListener{
            increment = 2;
            button.text = "Add 2"
        }
    }
}