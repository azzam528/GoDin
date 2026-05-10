package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CheckoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

       /* // BACK → CartActivity
        findViewById<ImageView>(R.id.btn_backcheck).setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
            finish()
        }

        // PLACE ORDER → HomeActivity
        findViewById<Button>(R.id.btn_placeorder).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finishAffinity()
            // finishAffinity biar Checkout & Cart ke-clear
        }*/
    }
}
