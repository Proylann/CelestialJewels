package com.example.celestialjewel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Registration : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration)


        val RegisterBttn = findViewById<Button>(R.id.Registration)


        RegisterBttn.setOnClickListener(){
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
        }




    }
}