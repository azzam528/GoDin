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

class MapsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_maps)

        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {

                val intent = Intent(this@MapsActivity, MenuList::class.java)
                startActivity(intent)


                finish()
            }
        }


        onBackPressedDispatcher.addCallback(this, callback)
    }

    fun bukaMap(view: View) {
        val lokasi = "geo:-7.6077365,110.7355044"
        val mapIntent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(lokasi)
        }
        startActivity(mapIntent)
    }

    fun pindahActivity(view: View) {
        val intent = Intent(this, MenuList::class.java)
        startActivity(intent)
    }




    }
