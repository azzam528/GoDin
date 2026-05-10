package com.example.test

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MenuList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_list)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewMakanan)

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = MakananAdapter()
    }
}