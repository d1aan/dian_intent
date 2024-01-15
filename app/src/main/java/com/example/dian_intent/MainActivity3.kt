package com.example.dian_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btnhome2: Button = findViewById(R.id.btnhome2)

        btnhome2.setOnClickListener{
            val intent = Intent( this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}