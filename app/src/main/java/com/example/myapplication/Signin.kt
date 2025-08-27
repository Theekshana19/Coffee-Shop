package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signin)

        val button2 = findViewById<Button>(R.id.button3)
        button2.setOnClickListener{
            val intent = Intent(this,Signup::class.java)
            startActivity(intent)

            val button10 = findViewById<Button>(R.id.signin)
            button10.setOnClickListener {
                val intent = Intent(this,Home::class.java)
                startActivity(intent)
            }
        }
    }
}