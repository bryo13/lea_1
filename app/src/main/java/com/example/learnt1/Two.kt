package com.example.learnt1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val sentName = intent.getStringExtra("Name")
        val tx = findViewById<TextView>(R.id.tvTwo)

        tx.text = sentName
    }
}