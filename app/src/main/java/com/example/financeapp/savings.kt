package com.example.financeapp

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class savings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_savings)
        val homeimg : ImageView = findViewById(R.id.home)
        val transactionimg : ImageView = findViewById(R.id.transactions)
        homeimg.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        transactionimg.setOnClickListener{
            val intent = Intent(this,TransactionActivity::class.java)
            startActivity(intent)
        }
    }
}