package com.example.test

import RestaurantHomeCard
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        // Edge to Edge padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // BUTTON PROFILE
        val btnProfile = findViewById<ImageButton>(R.id.btnProfile)
        btnProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        // RECYCLER VIEW RESTAURANT
        val restaurants = listOf(
            RestaurantHomeCard("Joe Kho Wie Chinese Food", "Chinese, Fast Food", "⭐ 4.2 • 30 mins", R.drawable.photo_2_seribu_rasa),
            RestaurantHomeCard("Pizza Hut", "Fast Food", "⭐ 4.2 • 30 mins", R.drawable.pizzahut),
            RestaurantHomeCard("MacDonalds", "Fast Food", "⭐ 4.5 • 30 mins", R.drawable.alvin_burgerhome),
            RestaurantHomeCard("AyamPakGembus", "Fast Food", "⭐ 4.5 • 30 mins", R.drawable.alvin_pakgembus)
        )

        val rv = findViewById<RecyclerView>(R.id.rvRestaurants)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = RestaurantCardAdapter(restaurants) { restaurant ->
            Toast.makeText(this, "Klik: ${restaurant.name}", Toast.LENGTH_SHORT).show()
        }
    }
}