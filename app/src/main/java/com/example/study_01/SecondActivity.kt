package com.example.study_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val tvofferMessage = findViewById<TextView>(R.id.tvSecondActivity1)
        val username = intent.getStringExtra("USER")
        val message = "$username you have got access to all for one month"
        tvofferMessage.text = message
    }
}