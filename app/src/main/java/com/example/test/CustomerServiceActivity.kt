package com.example.test

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CustomerServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_customer_service)

        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
//back pakai tombol back fisik hp
//                val intent = Intent(this@CustomerServiceActivity, ProfileActivity::class.java)
//                startActivity(intent)


                finish()
            }
        }


        onBackPressedDispatcher.addCallback(this, callback)

        }

    fun panggil(view: View) {
        val nomor = "081222886240"
        val panggil = Intent(Intent.ACTION_DIAL).apply{
            data = Uri.fromParts("tel", nomor, null)
        }
        startActivity(panggil)
    }

    }
