package com.example.learnt1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hero = findViewById<TextView>(R.id.textView)
        val enterGreet = findViewById<EditText>(R.id.entergreet)
        val but = findViewById<Button>(R.id.button)
        val offer = findViewById<Button>(R.id.offer)

        var gre = ""

        but.setOnClickListener {
            gre = enterGreet.text.toString()
            if (gre == "") {
                offer.visibility = INVISIBLE
                Toast.makeText(
                    this@MainActivity,
                    "Enter name for offers",
                    Toast.LENGTH_SHORT)
                    .show()
            } else {
                val message = "hello $gre"
                hero.text = message
                enterGreet.text.clear()
                offer.visibility = VISIBLE
            }
        }

        offer.setOnClickListener {
            val intent = Intent(this,Two::class.java)
            intent.putExtra("Name",gre)
            startActivity(intent)
        }
    }
}