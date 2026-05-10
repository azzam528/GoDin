package com.example.test

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cart)



        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {

                val intent = Intent(this@CartActivity, MenuList::class.java)
                startActivity(intent)


                finish()
            }
        }


        onBackPressedDispatcher.addCallback(this, callback)
    }


//    fun pindahActivity(view: View) {
//        val intent = Intent(this, CheckoutActivity::class.java)
//        startActivity(intent)
//    }

    }
