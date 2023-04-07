package com.example.study_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log.d
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.*
// https://www.youtube.com/watch?v=BCSlZIUj18Y&t=5341s
class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val t1 = findViewById<TextView>(R.id.text01)
        val bt = findViewById<Button>(R.id.button)
        var message = ""
        t1.text = "Hey!"

        bt.setOnClickListener(){
            val et1 = findViewById<EditText>(R.id.edittext01)
            val ht1 = findViewById<TextView>(R.id.textHello)
            val btnOfferButton = findViewById<Button>(R.id.button2)
            message = et1.text.toString()
            if (message == "") {
                Toast.makeText(this@MainActivity, "Please, Enter your name", Toast.LENGTH_SHORT).show()
                ht1.text = message
                btnOfferButton.visibility = INVISIBLE
            }else{
                ht1.text = "Hello $message"
                et1.text.clear()
                btnOfferButton.visibility = VISIBLE

            }
        }

        val btnOfferButton = findViewById<Button>(R.id.button2)
        btnOfferButton.setOnClickListener {
            val intent: Intent = Intent( this, SecondActivity::class.java)
            intent.putExtra("USER", message)
            startActivity(intent)
        }

   }

    }



