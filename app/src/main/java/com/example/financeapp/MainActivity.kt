package com.example.financeapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val startbtn : Button = findViewById(R.id.getstartedbtn)
        startbtn.setOnClickListener{
            Toast.makeText(this, "Lets, manage your finance.", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,TransactionActivity::class.java)
            startActivity(intent)
        }
    }
}