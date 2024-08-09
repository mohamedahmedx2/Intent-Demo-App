package com.example.intentdemoapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tv = findViewById(R.id.textView2)

        val userEmail = intent.getStringExtra("email")
        val userPassword = intent.getStringExtra("password")

        val welcomeMessage = "Welcome:\nYour email: $userEmail\nYour password: $userPassword"
        tv.text = welcomeMessage
    }
}
