package com.example.dian_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNAMA: Button = findViewById(R.id.btnNama)
        val btnsmk: Button = findViewById(R.id.btnsmk)

        btnNAMA.setOnClickListener{
            val intent =Intent( this,MainActivity2::class.java)
            startActivity(intent)
        }

        btnsmk.setOnClickListener{
            val intent =Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}