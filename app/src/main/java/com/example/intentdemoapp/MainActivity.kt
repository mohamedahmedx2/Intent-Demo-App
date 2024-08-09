package com.example.intentdemoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private lateinit var emailInput: TextInputEditText
    private lateinit var passwordInput: TextInputEditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailInput = findViewById(R.id.email_Et_input)
        passwordInput = findViewById(R.id.password_Et_input)
        loginButton = findViewById(R.id.button)

        loginButton.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            val myIntent = Intent(this, SecondActivity::class.java)
            myIntent.putExtra("email", email)
            myIntent.putExtra("password", password)
            startActivity(myIntent)
        }
    }
}
