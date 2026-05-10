package com.example.test

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        }

    fun pindahActivity(view: View) {
        val intent = Intent(this, RegistrActivity::class.java)
        startActivity(intent)
    }

//    fun pindahActivity2(view: View) {
//        val intent = Intent(this, HomeActivity::class.java)
//        startActivity(intent)
//    }
    }
