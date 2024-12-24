package com.example.financeapp

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class TransactionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_transactions)
        val homeimg : ImageView = findViewById(R.id.home)
        val savingimg : ImageView = findViewById(R.id.savings)
        homeimg.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        savingimg.setOnClickListener{
            val intent = Intent(this,savings::class.java)
            startActivity(intent)
        }
    }
}