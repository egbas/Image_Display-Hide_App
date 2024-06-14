package com.example.disappearingimagesapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnDisplay = findViewById<Button>(R.id.btnDisplay)
        val IvImage = findViewById<ImageView>(R.id.IvImage)


        btnDisplay.setOnClickListener {
            if (btnDisplay.text == "Remove") {
                IvImage.setImageResource(0)
                btnDisplay.text = "Display"
            } else {
                IvImage.setImageResource(R.drawable.myimage)
                btnDisplay.text = "Remove"
            }
        }
    }
}