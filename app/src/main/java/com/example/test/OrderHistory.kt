package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class OrderHistory : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_history)

       /* // BACK → ProfileActivity
        findViewById<ImageView>(R.id.btn_backhistory).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
            finish()
        }*/
    }
}
